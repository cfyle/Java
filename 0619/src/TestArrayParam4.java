public class TestArrayParam4 {
	// 배열의 원소 교환, index값 2개
	public void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String[] args) {
		int[] numbers = { 10, 0, 0, 40 };

		// 0번째 인덱스 원소와, 3번째 인덱스 원소의 값 교환
		TestArrayParam4 t = new TestArrayParam4();
		t.swap(numbers, 0, 3);
//		int temp = numbers[3];
//		numbers[3] = numbers[0];
//		numbers[0] = temp;

		System.out.println(numbers[0]);
		System.out.println(numbers[3]);
	}
}
