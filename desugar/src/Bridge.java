import java.util.Comparator;


public class Bridge implements Comparator<Integer> {
	
	public int compare(Integer first, Integer second) {
		return first - second;
	}
}
