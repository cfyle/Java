import java.util.Scanner;

public class Control2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("정수를 하나 입력하세요.");
		// int num = 4;
		int num = scanner.nextInt();

		if (num % 2 == 0) { // then 절
			System.out.println("짝수 입니다.");
		} else if (num % 2 != 0) {
			System.out.println("홀수 입니다.");
		}

		System.out.println("프로그램 종료");
	}
}
