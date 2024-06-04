/*
 *   사용자에게 정수를 반복 입력받아
 *   모든 입력 값의 합과 평균을 구하는 프로그램
 *   
 *   (사용자가 0 이하의 수를 입력하면, 입력이 종료되고 결과가 출력된다.)
 */
import java.util.Scanner;

public class Sum2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		boolean go = true;
		int count = 0;
		
		while (go) {
			System.out.println("반복 입력중");
			int num = scanner.nextInt();
			sum += num;
			count++;
			double average = sum / count;
			
			if (num == 0) {
				go = false;
				
			System.out.println("합계는 : " + sum);
			System.out.println("평균은: " + average);
			System.out.println("프로그램 종료");
			}
		}
		
	}
}
