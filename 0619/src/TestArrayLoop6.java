import java.util.Scanner;

// 사용자에게 몇 개의 정수를 입력할 지 물어본 후
// 원하는 만큼의 정수를 입력받아
// 짝수, 홀수의 개수를 집계해서 출력하기
// 모든 입력을 나열

public class TestArrayLoop6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("몇 개?");
		int length = scan.nextInt();
		
		int[] numbers = new int[length];
		
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			int input = scan.nextInt();
			count += input % 2 == 0 ? 1 : 0;
			numbers[i] = input;
		}
		System.out.println("짝수 개수 : " + count);
		System.out.println("홀수 개수 : " + (length - count));
		
		for (int num : numbers) {
			System.out.println(num);
		}
	}
}
