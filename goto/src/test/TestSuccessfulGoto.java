import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestSuccessfulGoto {
	
	private static ProcessHelper helper;
	private static ProcessResult compilationResult;
	private static ProcessResult executionResult;


	@BeforeClass
	public static void compile() throws IOException, InterruptedException {
		helper = new ProcessHelper("GotoSuccess");
		compilationResult = helper.compile();
		executionResult = helper.run();

	}


	@Test
	public void testCompilationSuccess() {
		compilationResult.assertSuccess();//success
	}

	@Test
	public void testRuntimeSuccess()  {
		
		executionResult.assertSuccess();
	}
	
	@Test
	public void testRuntimeBehaviour() {
		executionResult.assertOutputText("goto JFokus 2017!");
	}

}
