import java.util.Scanner;

public class UsingCatchInputNumber {
	private final static Scanner scanner = new Scanner(System.in);

	public static int input() {
		while (true) {
			try {
			System.out.println("정수를 입력하세요");
			return scanner.nextInt();
			} catch (RuntimeException e) {
				System.out.println("올바른 정수 형태를 입력해주세요");
				scanner.next();
			}
		}
	}

	public static void main(String[] args) {

		int result1 = input();
		int result2 = input();
		int result3 = input();
		int result4 = input();
		int result5 = input();
	}
}
