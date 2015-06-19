import org.junit.Assert;


/**
 * I represent the result of executing a sub process including result and output contents
 * @author marska
 *
 */
class ProcessResult {
	
	public ProcessResult(int result, String output) {
		super();
		this.result = result;
		this.output = output;
	}
	private int result;
	private String output;
	public int getResult() {
		return result;
	}
	public String getOutput() {
		return output;
	}
		
	public void assertSuccess() {
		Assert.assertEquals("Process should succeed: " , 0, this.getResult());
	}
	
	public void assertFailure() {
		Assert.assertNotEquals("Process should fail: ", 0, this.getResult());
	}
	
	
	
	public void assertOutputText(final String textSnippet) {
		String output = this.getOutput();
    Assert.assertTrue("Expected output to contain \"" + textSnippet + "\" but was:\n" + output, output.contains(textSnippet));
	}

}
