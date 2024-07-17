import java.util.ArrayList;
import java.util.List;

// getRange(int start, int end, int step) : set<Integer> {
//		시작값, 끝값 범위의 정수 집합 반환
//		(이 때, 값의 증가는 step 만큼 증가한다.)
//		(해당 범위에 값이 없는 경우 null 값 대신 크기가 0인 Set을 반환한다)
// }
// 1, 10, 2 => [1, 3, 5, 7, 9}
// 10, 10, 1 => []

public class Q2 {

	public List getRange(int start, int end, int step) {
		List<Integer> set = new ArrayList<>();
		for (int i = start; i <= end; i += step) {
			if (start > end) {
				return set;
			}
			set.add(i);
		}
		return set;
	}

	public static void main(String[] args) {
		Q2 q = new Q2();
		System.out.println(q.getRange(1, 10, 2));
	}
}