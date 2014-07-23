
public class GotoMissingLabel {
	
	public static void main(String[] args) {
		one: System.out.println("one");
		two: System.out.println("two");
		goto six;
		three: System.out.println("three");
		four: System.out.println("four");
		five: System.out.println("five");
	}

}
