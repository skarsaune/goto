import org.junit.BeforeClass;
import org.junit.Test;


public class TestLambdaCompilation {
	
	static ProcessHelper helper;
	@BeforeClass
	public static void compile() {
		helper=new ProcessHelper("LambdaExample");
	}
	
	@Test
	public void testCompilation() {
		helper.compile().assertSuccess();
	}

}
