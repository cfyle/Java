import java.util.Arrays;

public class TestSearch4 {
	public static void main(String[] args) {
		int[] numbers = {15, 2, 66, 3, 20, 33, 7, 8};
		
		//  sort = 작은 순서부터 정렬
		Arrays.sort(numbers);
		
		System.out.println(Arrays.toString(numbers));
		
		// 7의 인덱스 찾기
		System.out.println(Arrays.binarySearch(numbers, 7));
	}
}
