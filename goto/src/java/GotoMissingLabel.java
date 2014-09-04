
public class GotoMissingLabel {
	
  public static void main(String[] args) {
    one: System.out.print("goto ");
    two: System.out.print("Java");
    goto six;
    three: System.out.print("2014");
    goto five;
    four: System.out.print("Zone ");
    goto three;
    five: System.out.print("!");
  }

}
