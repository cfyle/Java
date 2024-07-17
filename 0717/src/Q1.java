import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// getMeasureSet (int num) : Set<Integer> { 정수를 전달받아, 약수를 원소로 가지는 집합 반환 }
// 10 => [ 1, 2, 5, 10]

public class Q1 {

	public static List<Integer> getMeasureSet(int number) {
		List<Integer> set = new ArrayList<>();
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				return set.add(i);
			}
		}
		return set;
	}

	public static void main(String[] args) {
		List<Integer> set = new ArrayList<>();

		set.add(new Integer(10));
		getMeasureSet(10);

	}
}
