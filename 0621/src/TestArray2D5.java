import java.util.Arrays;

public class TestArray2D5 {
	public static void main(String[] args) {
		int[][] arr = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));

		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.deepToString(arr));
		
		for(int[] a : arr) {
			for(int elem : a) {
				System.out.println(elem);
			}
		}

	}
}
