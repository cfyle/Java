import java.util.Scanner;

// 사용자에게 정수 A, B 를 입력받아
// A 나누기 B의 몫과 나머지를 출력하는 프로그램
public class Control5 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 A, B 를 입력하세요");
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		if (b != 0) {
			System.out.println("A 나누기 B의 몫 : " + a / b);
			System.out.println("나머지 : " + a % b);
		} else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("프로그램 종료");
	}

}
