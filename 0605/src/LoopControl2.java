import java.util.Scanner;

/* 
 * 
 * 사용자가 자연수를 반복 입력하는 프로그램
 * 이 때, 입력된 정수는 이전의 입력보다 커야합니다.
 * 
 * (0, 음수, 이전 입력보다 작은 경우는 반복 종료)
 */
public class LoopControl2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		for (int i = 1; i > 0; i++) {
			System.out.println("자연수를 입력하세요");
			i = s.nextInt();
			
			if (i <= 0) {
				break;
			}			
		}
		System.out.println("프로그램을 종료합니다");
	}
}
