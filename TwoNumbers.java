// 프로그램 사용자에게 정수 2개를 콘솔 입력받아
// 모두 출력하는 프로그램

// (변수는 하나의 값만을 저장할 수 있어요)

import java.util.Scanner;

public class TwoNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력하세요");
		int num1 = scanner.nextInt();
		//int num2 = scanner.nextInt();
		System.out.println("입력하신 숫자는 " + num1);
		
		
		System.out.println("다음 정수를 입력하세요");
		
		int num2 = scanner.nextInt();
		
		System.out.println("입력하신 숫자는 " + num1 + "와 " + num2 + " 합은 " +(num1 + num2));
		System.out.println("두 수의 합은 " + num1 + num2);
		
	}
}