/*
 *   사용자가 점수를 반복입력하는 프로그램
 *   (단, 0을 입력하면 프로그램이 종료됩니다.)
 */



import java.util.Scanner;

public class Loop9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean go = true;
		while (go) {
			System.out.println("반복 입력 중");
			int num = scanner.nextInt();
			
			if (num == 0) {
				go = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
