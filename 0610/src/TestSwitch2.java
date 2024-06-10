import java.util.Scanner;

public class TestSwitch2 {
	public static void main(String[] args) {
		// 사용자가 입력한 달(month)의 일 수를 출력하기 (단, 평년 기준)
		// 1 => 31, 2 => 28, 3=> 31 ...
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("일 수를 알고 싶은 달을 입력하세요");
		int month = scan.nextInt();
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8:
			System.out.println("31일");
			break;
		case 2:
			System.out.println("28일");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일");
			break;
		default:
			System.out.println("잘못 입력하셨습니다. (1 ~ 12 사이의 수를 입력해주세요)");
			
		
//		switch (month) {
//		case 1:
//			System.out.println("31일");
//			break;
//		case 2:
//			System.out.println("28일");
//			break;
//		case 3:
//			System.out.println("31일");
//			break;
//		case 4:
//			System.out.println("30일");
//			break;
//		case 5:
//			System.out.println("31일");
//			break;
//		case 6:
//			System.out.println("30일");
//			break;
//		case 7:
//		case 8:
//			System.out.println("31일");
//			break;
//		case 9:
//			System.out.println("30일");
//			break;
//		case 10:
//			System.out.println("31일");
//			break;
//		case 11:
//			System.out.println("30일");
//			break;
//		case 12:
//			System.out.println("31일");
//			break;
//		default:
//			System.out.println("월을 잘못 입력하셨습니다.");
		}
	}
}
