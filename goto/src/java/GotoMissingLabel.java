
public class GotoMissingLabel {
	
  public static void main(String[] args) {
    one: System.out.print("goto ");
    two: System.out.print("sommer");
    goto six;
    three: System.out.print("2017");
    goto five;
    four: System.out.print("møte ");
    goto three;
    five: System.out.print("!");
  }

}
