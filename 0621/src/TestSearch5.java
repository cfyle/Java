import java.util.Arrays;
import java.util.Scanner;

// 사용자가 입력한
// 정수 5개
// 입력된 정수의 최소값, 최대값을 출력해보세요



public class TestSearch5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] numbers = new int[5];
		System.out.println("정수 5개를 입력하세요");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = s.nextInt();		
		}
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println("최소값 : " + numbers[0]);
		System.out.println("최대값 : " + numbers[numbers.length - 1]);
		
	}
}
