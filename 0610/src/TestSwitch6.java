import java.util.Scanner;

public class TestSwitch6 {
	public static void main(String[] args) {
		// 사용자에게 직사각형의 밑변, 높이를 입력받고
		// 문자열로 "넓이" 또는 "둘레"를 입력받아
		// 연산결과를 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("직사각형의 밑변?");
		int width = scanner.nextInt();
		
		System.out.println("직사각형의 높이?");
		int height = scanner.nextInt();
		
		System.out.println("무엇을 구할까요?? (넓이 or 둘레)");
		scanner.nextLine();
		String command = scanner.nextLine();
		
		switch (command) {
		case "넓이":
			System.out.println(width * height);
			break;
		case "둘레":
			System.out.println(2 *(width + height));
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
			
		}
		
	}

}
