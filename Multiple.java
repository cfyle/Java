// 사용자의 입력값이
// 100 이상 200 미만의 수이고
// 3의 배수인 경우 true
// 범위를 벗어나거나, 3의 배수가 아닌경우는 false

// 102 - > true, 105 -> true, ...109 -> true

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 하나 입력하세요");
		
		int num = scanner.nextInt();
		
		System.out.println((100 <= num && num <=200) && num % 3 == 0);
		
		// boolean isRange = 100 <= num && num <200;
		// boolean 
		
		
	}
}