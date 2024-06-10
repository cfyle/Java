import java.util.Scanner;

public class TestDowhile2 {
	public static void main(String[] args) {
		// 사용자가 정수 입력
		// 0을 입력하면 종료
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 입력");
		boolean go = true;
		while (go) {
			System.out.println("정수 입력");
			int num = scanner.nextInt();

			do {
				System.out.println("정수를 입력");
				num = scanner.nextInt();
			} while (num != 0);

//			if (num == 0 ) {
//				go = false;
//			}
		}
		System.out.println("프로그램 종료");

	}
}
