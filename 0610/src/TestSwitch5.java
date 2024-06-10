import java.util.Scanner;

public class TestSwitch5 {
	public static void main(String[] args) {
		// 사용자에게 정수 2개와
		// 연산자 + - * / 중 하나를 입력받아
		// 계산결과를 출력하는 프로그램
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("+ - * / 중 하나를 입력하세요");
		String operator = scan.nextLine();
		
		System.out.println("첫번째 정수를 입력하세요");
		int num1 = scan.nextInt();
		
		System.out.println("두번째 정수를 입력하세요");
		int num2 = scan.nextInt();
		
		switch (operator) {
		case "+":
			System.out.println(num1 + num2);
			break;
		case "-":
			System.out.println(num1 - num2);
			break;
		case "*":
			System.out.println(num1 * num2);
			break;
		case "/":
			System.out.println(num1 / num2);
			break;
		default:
			System.out.println("연산자를 잘못 입력하셨습니다.");
			break;
		}
		
		
	}
}
