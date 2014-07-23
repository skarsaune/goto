public class GotoSuccess {


	public static void main(String[] args) {
		one: System.out.println("one");
		two: System.out.println("two");
		goto four;
		three: System.out.println("three");
		goto five;
		four: System.out.println("four");
		goto three;
		five: System.out.println("five");
	}
}
