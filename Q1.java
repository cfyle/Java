import java.util.ArrayList;
import java.util.List;

// getMeasureSet (int num) : Set<Integer> { 정수를 전달받아, 약수를 원소로 가지는 집합 반환 }
// 10 => [ 1, 2, 5, 10]

public class Q1 {

	public List getMeasureSet(int number) {
		List<Integer> set = new ArrayList<>();

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				set.add(i);
			}
		}

		return set;
	}

	public static void main(String[] args) {
		Q1 q = new Q1();
		System.out.println(q.getMeasureSet(10));

	}
}