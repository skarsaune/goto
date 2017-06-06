
public class GotoCircularWarning {
	public static void main(String[] args) {
    one: System.out.print("goto ");
    two: System.out.print("sommer");
    goto four;
    three: System.out.print("2017");
    goto five;
    four: System.out.print("møte ");
    goto three;
    five: System.out.println("!");
    goto one;//forms infinite loop
  }
}
