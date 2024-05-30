import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = scan.nextInt();
		
		System.out.println("입력하신 정수는 " + num + "입니다.");
		
		System.out.println("프로그램 종료");
	}
}