import java.util.Arrays;

// 1. 다음 배열 [1, 7, 7, 6, 5, 5, 2] 중복을 제거하여 => [1, 7, 6, 5, 2]

public class Q1 {
	public static void main(String[] args) {
		int[] arr = { 1, 7, 7, 6, 5, 5, 2 };

		int[] copy = arr;

		int count = 0;

		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (i == 0 || arr[i] != arr[i - 1]) {
				arr[count++] = arr[i];
			}

		}

	}
}
