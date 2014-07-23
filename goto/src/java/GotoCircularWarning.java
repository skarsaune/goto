
public class GotoCircularWarning {
	
	public static void main(String[] args) {
		one: System.out.println("one");
		two: System.out.println("two");
		goto four;//ok
		three: System.out.println("three");
		four: System.out.println("four");
		goto three;//not ok, forms an infinite loop
		five: System.out.println("five");
	}

}
