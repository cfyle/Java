
public class TestMxArray {
	// 배열과 값을 전달받아 값보다 큰 원소의 개수를 반환하는 메소드
	public static <T extends Comparable<T>> Integer countGreater(T[] arr, T target) {
		int count = 0;
		for (T i : arr) {
			if (i.compareTo(target) > 0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Integer[] arrInt = {10, 20, 30};
		int count = countGreater(arrInt, 15);
		System.out.println(count);
		
		Double[] arrDbl = {15.0, 25.0, 35.0};
	}
}
