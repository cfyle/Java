import java.util.Scanner;
// Scanner 를 사용하기 위해

public class Input {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");  // 출력 메소드 호출
		
		Scanner scan = new Scanner(System.in);
	//	변수의 선언   =  값을 집어넣음 
	
		System.out.println("정수를 입력하세요");
		int num = scan.nextInt();  // 입력 메소드 호출
		
		System.out.println("입력하신 정수는 " + num + "입니다.");
		
		System.out.println("프로그램 종료");
	}
}