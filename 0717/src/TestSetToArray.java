import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestSetToArray {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>(Arrays.asList(100, 100, 200, 300, 300, 55, 77, 54));

		Integer[] array = set.toArray(new Integer[0]);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
