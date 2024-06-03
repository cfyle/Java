
// 사용자에게 정수를 입력받아
// 0 이상 100 이하의 수인 경우는 OK 메시지 출력
// 짝수인지 홀수인지를 출력
// 이외의 경우에는, 입력 가능 범위를 알려주는 메세지 출력
import java.util.Scanner;

public class Control7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num = scanner.nextInt();

		if (num >= 0 && num <= 100) {
			if (num % 2 == 0) {
				System.out.println("짝수 입니다.");
			}
			System.out.println("홀수 입니다.");
		} else {
			System.out.println("정수는 0 ~ 100까지만 입력 가능합니다.");
		}
	}
}
