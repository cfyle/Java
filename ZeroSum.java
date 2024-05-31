// 사용자가 입력한 두 개의 정수의 합이
// 0이면 true를 출력하고
// 나머지의 경우에는 false를 출력하는 프로그램

import java.util.Scanner;

public class ZeroSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 두개 입력하세요");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		System.out.println((num1 + num2) == 0);
	}
}