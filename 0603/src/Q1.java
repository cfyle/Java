/*   
 *    2. 사용자에게 정수 3개를 입력받아, 가장 큰 수를 출력하는 프로그램
 *    	  예) 4 2 9 => 9
 */
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 3개 입력하세요");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		if (num1 >= num2 & num1 >= num2) {
			System.out.println(num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2);
		} else {
			System.out.println(num3);
		}
	}
}
