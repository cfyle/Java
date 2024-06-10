import java.util.Scanner;

public class TestSwitch3 {
	public static void main(String[] args) {
		// 사용자에게 다음과 같은 형태의 주민등록번호를 입력받고
		// 예) 990912-2
		// 남성, 여성을 판별받아 출력하는 프로그램

		Scanner scan = new Scanner(System.in);

		System.out.println("주민등록번호를 입력하세요.");

		String idCode = scan.nextLine();

		if (idCode.length() != 8) {
			System.out.println("8자의 형식으로 입력해주세요");
		} else {

			char last = idCode.charAt(idCode.length() - 1);
			System.out.println(last);

			switch (last) {
			case '1':
			case '3':
				System.out.println("남성");
				break;
			case '2':
			case '4':
				System.out.println("여성");
				break;
			default:
				System.out.println("주민등록번호를 잘못 입력하셨습니다.");
			}
		}

	}
}
