public class GotoSuccess {
	
	public static void main(String[] args) {
		one: System.out.print("goto ");
		two: System.out.print("DEV");
		goto four;
		three: System.out.print("UK");
		goto five;
		four: System.out.print("OXX ");
		goto three;
		five: System.out.print("!");
	}
}
