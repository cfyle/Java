// 3. 사용자에게 정수를 입력받아 팩토리얼 구하기
import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = s.nextInt();
		int result = 1;
		
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		System.out.println("!" + num + " = " + result);
	}
}
