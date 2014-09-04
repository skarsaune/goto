



import java.util.Comparator;

import lambda.ReflectionClassPrinter;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestLambda {
  
  @BeforeClass
  public static void showVersion() {
    System.out.println("Java version: " + System.getProperty("java.specification.version"));
    System.out.println("Classpath: " + System.getProperty("java.class.path"));
  }
  

	
	@SuppressWarnings("unchecked")
	@Test
	public void testBridgeLambda() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	  System.out.println("RUN SIMPLE LAMBDA:");
	  System.out.println();
	  final LambdaExample provider = new LambdaExample();
    Comparator<String> comparator=provider.lambdaExample();
		System.out.println(new ReflectionClassPrinter().listClass(comparator.getClass()));
		Assert.assertTrue(comparator.compare("one", "two") < 0);
		Assert.assertThat("Subsequent invocations give lambda of same class", provider.lambdaExample(), Is.isA((Class<Comparator<String>>)comparator.getClass()));

    
	}


  @SuppressWarnings("unchecked")
	@Test
	public void testCaptureLambda() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
    System.out.println("RUN LAMBDA WITH CAPTURE:");
    System.out.println();
    final LambdaExample provider = new LambdaExample();
    Comparator<String> comparator=provider.withInstanceAndLocalCapture();
		new ReflectionClassPrinter().listClass(comparator.getClass());
		System.out.println(new ReflectionClassPrinter().listClass(comparator.getClass()));
		new ReflectionClassPrinter().listClass(comparator.getClass());
		Assert.assertThat("Subsequent invocations give lambda of same class", provider.withInstanceAndLocalCapture(), Is.isA((Class<Comparator<String>>)comparator.getClass()));
		Assert.assertTrue(comparator.compare("one", "two") < 0);
		
	}	
	
	


}
