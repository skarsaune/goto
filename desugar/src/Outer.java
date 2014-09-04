public class Outer {
	private void foo() {  }

	public Runnable fooRunner() {
		return new Runnable() {
			public void run() {
				foo();
			}
		};
	}
}
