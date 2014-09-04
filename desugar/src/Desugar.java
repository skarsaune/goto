import java.util.Arrays;
import java.util.List;

public class Desugar {
	public void run() {
		List<Integer> list = Arrays.asList(1, 2);
		for (Integer i : list) System.out.println("Double: " + i * 2);
			
	}
}
