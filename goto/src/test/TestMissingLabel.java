import org.junit.BeforeClass;
import org.junit.Test;

public class TestMissingLabel {
	
	private static ProcessResult compilationResult;

	@BeforeClass
	public static void compile() {
		compilationResult = new ProcessHelper("GotoMissingLabel").compile();
		

	}


	@Test
	public void testCompilationFailure() {
		compilationResult.assertFailure();
	}
	
	@Test
	public void testCompilationErrorString() {
		compilationResult.assertOutputText("error: undefined label: six");
	}


}
