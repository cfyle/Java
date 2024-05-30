// 4. 사용자에게 5자리의 정수를 입력받아
// 역순으로 출력하는 프로그램

// 입력예) 12345 => 출력예) 54321

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int a = s.nextInt();
		
		int b = a / 10000; 
		int c = a % 10000 / 1000;
		int d = a % 10000 % 1000 / 100;
		int e = a % 10000 % 1000 % 100 / 10;
		int f = a % 10000 % 1000 % 100 % 10;
		System.out.printf("%d%d%d%d%d", f, e, d, c, b);
		
		
	}
}