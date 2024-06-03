// 사용자에게
// 메뉴 번호를 입력받아
// 가격을 출력하는 프로그램

// 1. 콜라
// 2. 사이다

// 콜라의 가격은 1000원
// 사이다의 가격은 1600원

import java.util.Scanner;

public class Control8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("콜라의 갯수와 사이다의 갯수를 입력하세요");
		
		System.out.println("1. 콜라의 개수는?");
		int coke = scanner.nextInt();
		
		System.out.println("2. 사이다의 개수는?");
		int sprite = scanner.nextInt();
		
		int priceCoke = coke * 1000;
		int priceSprite = sprite * 1600;

		if (0 <= coke && 0 <= sprite) {
			int sum = priceCoke + priceSprite;
			System.out.println(sum + "원 입니다");
		}

	}
}
