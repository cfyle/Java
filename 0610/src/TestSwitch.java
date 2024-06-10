import java.util.Scanner;

public class TestSwitch {
	public static void main(String[] args) {
		// 1.콜라 (1500) 2.사이다(1400) 3.환타(1300)
		// 사용자가 입력한 메뉴
		// 가격 출력하는 프로그램
		
		Scanner scan = new Scanner(System.in);
		System.out.println("-- 메뉴 --");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 환타");
		
		int choose = scan.nextInt();
		
		// switch 문은 정수 형태
		switch (choose) {
		case 1:
			System.out.println("1500원");
			break;
		case 2:
			System.out.println("1400원");
			break;
		case 3:
			System.out.println("1300원");
			break;
		default: 
			System.out.println("잘못된 메뉴 번호입니다.");
			break;
		}
	}
}
