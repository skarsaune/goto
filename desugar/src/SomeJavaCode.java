import static java.util.Arrays.asList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SomeJavaCode  {
	// 0. enum type
	enum Valid {
		TRUE, 
		FALSE, 
		MAYBE
	}

	// 1. static variable initializer, static import, vararg call, boxing
	public static final List<Integer> defaults = asList(3, 2, 1);

	// 2. static block, anonymous inner class, generic method signature,
	// unboxing
	static {
		Collections.sort(defaults, new Comparator<Integer>() {

			@Override
			public int compare(final Integer first, final Integer second) {
				// even numbers first
				return first % 2 - second % 2;
			}
		});
	}

	// 3. instance variable initializers
	private Valid status = Valid.MAYBE;

	// 4. NO DEFAULT CONSTRUCTOR

	public void run() {
		// 5. for each loop, string concatenation
		for (Integer i : defaults)
			System.out.println("entry: " + i);

		// 7. Enum based switch
		switch (this.status) {
		case FALSE:
			System.out.println(this.status.name());
			break;
		default:
			break;
		}
	}
}
