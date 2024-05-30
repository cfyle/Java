// 잔돈 계산기

// 전달 받은 금액과 상품의 가격을 콘솔 입력받아
// 거스름돈을 출력하는 프로그램

// (정수 데이터를 활용합니다)

import java.util.Scanner;

public class Money {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("전달 받은 금액을 입력하세요");
		int money = scan.nextInt();
		System.out.println("상품의 가격을 입력하세요");
		int price = scan.nextInt();
		
		System.out.println("거스름돈 : " + (money - price));
	}
}