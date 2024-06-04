/*
 * 사용자에게 5개의 정수를 반복 입력받아
 * 2자리 수이고, (10 - 99), 일의 자리가 3, 6, 9 인 정수의 개수 구하기
 * 
 */

import java.util.Scanner;

public class Counting2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 5개 입력");

		int i = 0;
		int count = 0;
		while (i < 5) {
			int num = scanner.nextInt();
			boolean is2Digit = 10 <= num && num < 100;
			int mod = num % 10;
			boolean is369 = mod == 3 || mod == 6 || mod == 9;

			if (is2Digit && is369) {
				count++;
			}
			i++;
		}
		System.out.println("총 집게된 개수 : " + count);
		System.out.println("프로그램 종료");
	}
}
