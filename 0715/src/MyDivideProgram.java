import java.util.InputMismatchException;
import java.util.Scanner;

public class MyDivideProgram {
	public static void main(String[] args) {
//		int a = 10;
//		int b = 0;
//		try {
//			System.out.println("문장1");
//			System.out.println("문장2");
//			int result = a / b;
//			System.out.println("문장3");
//		} catch (Exception e) {
//			System.out.println("예외 발생");
//		}
//		System.out.println("일반적인 문장");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 나눗셈");
		try {
		System.out.println("첫번째 정수를 입력해주세요");
		int left = scanner.nextInt();
		
		System.out.println("두번째 정수를 입력해주세요");
		int right = scanner.nextInt();
		
		if (right != 0) { 
		System.out.println("몫 : " + left / right);
		} else {
			System.out.println("0으로 나눌 수 없습니다");
		}
		} catch (InputMismatchException e) {
			System.out.println("정수 입력이 필요합니다");
		}
		System.out.println("프로그램 종료");
	}
}
