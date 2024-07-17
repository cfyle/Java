import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestInitSet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>(Arrays.asList(10, 20, 30, 40, 10, 20));
		
		System.out.println(set);
		
		Set<Integer> set2 = new HashSet<>(Arrays.asList(30, 40, 50, 60));
		
		Set<Integer> union = new HashSet<>();
		
		// 합집합
		union.addAll(set);
		union.addAll(set2);
		
		System.out.println(union);
	}
}
