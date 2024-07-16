public class TestArray {
	public static void main(String[] args) {
		int[] numbers = { 100, 200, 400, 500 };

		try {
			for (int i = 0; i <= numbers.length; i++) {
				System.out.println(numbers[i]);

			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위를 벗어난 접근");
		}
	}
}
