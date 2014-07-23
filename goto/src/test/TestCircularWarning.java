import org.junit.BeforeClass;
import org.junit.Test;

public class TestCircularWarning {
	
	private static ProcessResult compilationResult;
	@BeforeClass
	public static void compile() {
		compilationResult = new ProcessHelper("GotoCircularWarning").compile();
	}

	@Test
	public void testCompilationSuccess() {
		compilationResult.assertSuccess();
	}
	
	@Test
	public void testCompilationWarning() {
		compilationResult.assertOutputText("warning: circular goto");
	}

}
