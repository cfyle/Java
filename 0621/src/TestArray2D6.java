import java.util.Arrays;

public class TestArray2D6 {
	public static void main(String[] args) {
		int[] row1 = {10, 20, 30};
		int[] row2 = {40, 50, 60};
		
		int[][] arr1 = new int[][] { row1, row2 };
		
		int[][] arr2 = new int[][] { row1, row2 };
		
		System.out.println(arr1 == arr2);
		
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.deepEquals(arr1, arr2));
	}
}
