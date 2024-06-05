// 5. 사용자에게 정수를 입력받아, 소수 여부를 확인 가능한 프로그램

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("정수를 하나 입력하세요");
		
		int num = s.nextInt();
		int count = 0;
		int primeNumber = 2;
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {				
				count++;
			} 
		}
		if (count == primeNumber) {
			System.out.println(num + "는 소수 입니다.");
		} else 
			System.out.println(num + "는 소수가 아닙니다.");
	}
}
