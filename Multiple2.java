// 사용자가 두개의 정수를 입력받아
// 첫번째 입력받은 정수가 두번째 정수보다 크고
// 첫번째 정수가 두번째 정수의 배수인 경우에 true

// (단, 두 수는 모두 양수여야만 true)

// 30 10 => true
// 25 10 => false
// 10 30 => false

import java.util.Scanner;

public class Multiple2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 두개 입력하세요");
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		//System.out.println((num1 > num2) && (num1 % num2 == 0) && num1 > 0 && num2 > 0);
		
		boolean isLarger = num1 > num2;
		boolean isMultiple = num1 % num2 == 0;
		boolean isPositive = num1 > 0 && num2 > 0;
		
		System.out.println(isLarger && isMultiple && isPositive);
		
		
	}
}