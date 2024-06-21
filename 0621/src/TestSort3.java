import java.util.Arrays;

public class TestSort3 {
	public static void main(String[] args) {
		int[] numbers = {3, 1, 7, 12, 8};
		
		// 위의 배열의 원소를 큰 순서대로 나열한 배열을 생성해보기
		// [12, 8, 7, 3, 1]
		
		int[] copy = Arrays.copyOf(numbers, numbers.length);
		Arrays.sort(copy);
		
		int[] reversed = new int[5];
		
		for (int i = copy.length - 1, j = 0; i >= 0; i--, j++) {
			reversed[j] = copy[i];
		}
		System.out.println(Arrays.toString(reversed));
	}
}
