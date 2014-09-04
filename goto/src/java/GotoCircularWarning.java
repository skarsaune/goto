
public class GotoCircularWarning {
	public static void main(String[] args) {
    one: System.out.print("goto ");
    two: System.out.print("Java");
    goto four;
    three: System.out.print("2014");
    goto five;
    four: System.out.print("Zone ");
    goto three;
    five: System.out.println("!");
    goto one;//forms infinite loop
  }
}
