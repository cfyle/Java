import java.util.Arrays;

public class TestSearch3 {
	public static void main(String[] args) {
		// 다음은 중복이 없고, 정수의 크기대로 나열한 배열입니다
		int[] numbers = {1, 2, 3, 4, 8, 12, 15, 27, 33, 40};
		
		// 위의 배열에서 15를 찾으려고 함
		// 이진검색(binary search)
		System.out.println(Arrays.binarySearch(numbers, 15));
	}
}
