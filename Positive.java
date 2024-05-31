import java.util.Scanner;

public class Positive {
	public static void main(String[] args) {
		// 사용자에게 정수를 입력받아
		// 입력받은 정수가 음수면 false를 출력하고
		// 0이거나 양수이면 true를 출력하는 프로그램
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 하나 입력하세요");
		int num = scanner.nextInt();
		
		System.out.println(num >= 0 || num == 0);
		System.out.println(num > -1 || num == 0);
		
		
	}
}