import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;

import com.sun.tools.javac.Main;

/**
 * Facade to compile and run a sub process and record the results
 * @author marska
 *
 */


class ProcessHelper {
	
	private String className;
	private String version;
	
	
	
	ProcessHelper(String className) {
		super();
		this.className = className;
	}

	public ProcessResult compile() {
		StringWriter output = new StringWriter();
		if(classFile().exists() && !classFile().delete())
			throw new RuntimeException("Unable to delete old classfile");
		System.out.println("COMPILE:");
		int result = Main.compile(
				new String[] { 
				    "-bootclasspath",
				    System.getProperty("sun.boot.class.path"),
				    "-source",
				    System.getProperty("java.specification.version"),
            "-target",
            System.getProperty("java.specification.version"),
						"-d", 
						classFolder(),
						"src/java/" + className() + ".java" }, 
						new PrintWriter(
						output, true));
		if(result == 0 && !classFile().exists())
			throw new RuntimeException("Compilation did not produce expected class file");
		
		System.out.println(output.toString());
		return new ProcessResult(result, output.toString());
	}

	private String classFolder() {
		return "classfiles";
	}

	private File classFile() {
		return new File(classFolder() + "/" + className() + ".class");
	}

	private String className() {
		return this.className;
	}
	
	public ProcessResult run() throws IOException, InterruptedException {
	  System.out.println("RUN:");
		final Process process = Runtime.getRuntime().exec("java -cp " + classFolder() + " " +  className());
		final BufferedReader output = new BufferedReader(new InputStreamReader(process.getInputStream()));
		final BufferedReader error = new BufferedReader(new InputStreamReader(process.getErrorStream()));
		final StringBuilder builder = new StringBuilder();
		String line=null;
		while((line = output.readLine())!=null) {
			builder.append(line);
			builder.append('\n');
			System.out.println(line);
		}
		
		while((line = error.readLine())!=null) {
			System.err.println(line);
		}
		
		
		return new ProcessResult(process.waitFor(), builder.toString());
	}
	
	

}
