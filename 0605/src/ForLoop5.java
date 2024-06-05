/*
 *  사용자가 정수 범위의 시작, 끝을 입력하면
 *  모든 정수를 나열하고
 *  총 합을 출력하는 프로그램
 *  
 *  예) 0 5
 *  출력) 0 1 2 3 4 5
 * 		총합: 15
 */
import java.util.Scanner;

public class ForLoop5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수의 시작과 끝을 입력하세요");
		int start = scan.nextInt();
		int end = scan.nextInt();
		int sum = 0;
		
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
