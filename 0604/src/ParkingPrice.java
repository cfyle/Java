// 주차요금 계산기
// 10분당 1000원
// (단, 10분 미만은 무료입니다)
// 비회원은 500원의 추가요금이 발생합니다.
// (비회원은 최종 요금에 1.1배율이 적용됩니다)

import java.util.Scanner;

public class ParkingPrice {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		final int FEE = 1000;
		int min;
		int totalPrice;
		double extra = 0;
		
		System.out.println("주차 시간 입력(분단위)");
		min = scanner.nextInt();
		
		System.out.println("1. 회원, 2.비회원");
		int userInput = scanner.nextInt();
		if (userInput >= 1 && userInput <= 2) {
			if (userInput == 2) {
				extra = 1.1;
			}
		}
		
		totalPrice = (min / 10) * FEE;
		System.out.println(totalPrice + extra);

	}

}
