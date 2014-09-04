import static org.hamcrest.core.Is.is;
import org.junit.Assert;
import org.junit.Test;

import com.sun.tools.javac.parser.Scanner;
import com.sun.tools.javac.parser.ScannerFactory;
import static com.sun.tools.javac.parser.Tokens.TokenKind.*;
import com.sun.tools.javac.util.Context;


public class TestScanner {
	
	@Test
	public void testGotoToken() {
		final ScannerFactory factory = ScannerFactory.instance(new Context());
		final Scanner scanner = factory.newScanner("goto identifier;", false);
		scanner.nextToken();
		Assert.assertThat("First token is GOTO", scanner.token().kind,  is(GOTO));
		scanner.nextToken();
		Assert.assertThat("Second token is IDENTIFIER", scanner.token().kind,  is(IDENTIFIER));
		scanner.nextToken();
		Assert.assertThat("Third token is SEMI", scanner.token().kind,  is(SEMI));
	}

}
