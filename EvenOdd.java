// 사용자에게 정수 하나를 입력받아
// 짝수이면 true
// 홀수이면 false 를 출력해보세요

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력하세요");
		
		int num = scanner.nextInt();
		
		System.out.println((num % 2) == 0 && num > 0);
		// System.out.println((num / 2) >= 1);
	}
}