public class TestArray2D {
	public static void main(String[] args) {
		int[] row1 = { 10, 20, 30 };
		int[] row2 = { 40, 60, 70 };
		int[] row3 = { 70, 80, 90 };
		
		int[][] arr2d = { row1, row2, row3 }; // { { 10, 20, 30 }, { 40, 60, 70 }, { 70, 80, 90 } };
		
//		for (int i = 0; i < arr2d.length; i++) {
//			System.out.println(arr2d[i][0]);
//			System.out.println(arr2d[i][1]);
//			System.out.println((arr2d[i][2]));
//		}
		
		for (int i = 0; i < arr2d.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(arr2d[i][j]);
			}
			System.out.println();
		}
	}
}
