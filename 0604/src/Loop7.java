// 사용자가 입력한 정수의
// 100 ~ 200 사이의 배수들을 10개 나열하는 프로그램

// 입력예) 7 => 105 112 119 ...

import java.util.Scanner;

public class Loop7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력하세요");
		int userInput = scanner.nextInt();

		int i = 100;
		int count = 0;
		
		while (i <= 200 && count < 10) {
			if (i % userInput == 0) {
				System.out.println(i);
				count++;
			}
			i++;

		}
		System.out.println("총 개수 : " + count);

	}
}
