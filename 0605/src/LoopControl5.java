/* 
 * 사용자에게 정수를 입력받아
 * 2자리 정수일때, 역순으로 출력하는 프로그램
 * 
 * 예) 1
 * 2자리 정수를 다시 입력해주세요.
 * 33
 * 자리 값이 다른 정수를 입력해주세요.
 * 73
 * 뒤집은 수는 37 입니다.
 * -1
 * 
 * 총 입력은 4회이고, 올바른 입력은 1회 입니다.
 * 종료
 * 
 * (2자리 정수가 아니거나, 각 자리 값이 같으면 안내 메시지 출력과 다시 입력을 받는다)
 * (단 음수를 입력받으면 종료)
 */
import java.util.Scanner;

public class LoopControl5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("두자리 정수를 입력해주세요");
		
		int num = s.nextInt();
		
		for (int i = 10; i < 100; i++) {
			
		}
	
		
		
	}
}
