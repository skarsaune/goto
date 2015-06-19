
import java.util.Comparator;

public class LambdaExample  {

  public Comparator<String> lambdaExample() {
    return (String a, String b) -> a.compareTo(b);
  }

  private int c = 3; 
  public Comparator<String> withInstanceAndLocalCapture() {
    int a = 1, b = 2;
    return (String d, String e) -> d.compareTo(e) + a + b - c;
  }
  
  

}
