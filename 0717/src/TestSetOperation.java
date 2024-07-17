import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestSetOperation {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>(Arrays.asList(10, 20, 30, 40, 10, 20));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(30, 40, 50, 60));
		
		// 교집합
		Set<Integer> duplicated = new HashSet<>();
		duplicated.addAll(set);
		duplicated.retainAll(set2);
		
		
//		for (Integer num : set) {
//			if (set2.contains(num)) {
//				duplicated.add(num);
//			}
//		}
		System.out.println(duplicated);
		
		
		// 차집합 A - B
		Set<Integer> cha = new HashSet<>(set);
		cha.removeAll(set2);
		
		System.out.println(cha);
		
		
	}
}
