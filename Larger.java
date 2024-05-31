// 사용자에게 세 정수를 입력받아
// 각 정수의 입력이 크기 순으로 입력되었고
// 각 정수간 차이가 같다면 true

// 예)
// 1 2 3 -> true
// 1 3 5 -> true
// 1 3 9 -> false
// 1 7 5 -> false

import java.util.Scanner;

public class Larger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 3개 입력 하세요");
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		// System.out.println(num1< num2 && num2 < num3);
		
		boolean a = (num3 - num2) == (num2 - num1);
		boolean b = (num1 < num2) && (num2 < num3);
		
		System.out.println(a && b);
		
	}
}