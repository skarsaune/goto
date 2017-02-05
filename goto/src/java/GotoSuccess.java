public class GotoSuccess {
	
	public static void main(String[] args) {
		one: System.out.print("goto ");
		two: System.out.print("J");
		goto four;
		three: System.out.print("2017");
		goto five;
		four: System.out.print("Fokus ");
		goto three;
		five: System.out.print("!");
	}
}
