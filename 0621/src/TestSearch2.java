public class TestSearch2 {
	public static void main(String[] args) {
		// 다음은 같은 정수 값(중복)이 없는 배열입니다.

		int[] numbers = { 33, 36, 22, 14, 15, 30, 23 };

		// 위의 배열에서 정수 15가 있는지? 15의 인덱스는?
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 15) {
				System.out.println("정수 15의 인덱스 : " + i);
				break;
			}
		}
	}
}
