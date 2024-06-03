//스타벅스 가격 계산기(사용자가 메뉴와 사이즈를 입력하면, 가격이 출력되는 프로그램)
//- 메뉴 : 1.아메리카노, 2. 카페라떼, 3.마키아또
//- 사이즈 : 1.톨, 2.그란데, 벤티 (각 가격은 500원 만큼 차이납니다.)
// > 아메리카노 그란데 : 5000원
// > 카페라떼 그란데 : 5500원
// > 마키아또 그란데: 6400원

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("커피 메뉴를 입력하세요");
		System.out.println("1.아메리카노, 2.카페라떼, 3.마끼아또");
		int coffee = scanner.nextInt();
		if (coffee == 1) {
			System.out.println("아메리카노");
		} else if (coffee == 2) {
			System.out.println("카페라떼");
		} else if (coffee == 3) {
			System.out.println("마끼아또");
		} else {
			System.out.println("숫자 1 ~ 3 을 입력하세요");
		}
		
		System.out.println("커피 사이즈를 입력하세요");
		int size = scanner.nextInt();
		if (size == 1) {
			System.out.println("톨 사이즈");
		} else if (size == 2) {
			System.out.println("그란데 사이즈");
		} else if (size == 3) {
			System.out.println("벤티 사이즈");
		} else {
			System.out.println("숫자 1 ~ 3 을 입력하세요");
		}
		
		int americano = 5000;
		int latte = 5500;
		int makiato = 6400;
		int sizeMoney = 500;
		
		if (coffee == 1 && size == 2) {
			System.out.println(americano);
		} else if (coffee == 1 && size == 1) {
			System.out.println(americano - sizeMoney);
		} else if (coffee == 1 && size == 3) {
			System.out.println(americano + sizeMoney);
		} else if (coffee == 2 && size == 2) {
			System.out.println(latte);
		} else if (coffee == 2 && size == 1) {
			System.out.println(latte - sizeMoney);
		} else if (coffee == 2 && size == 3) {
			System.out.println(latte + sizeMoney);
		} else if (coffee == 3 && size == 2) {
			System.out.println(makiato); 
		} else if (coffee == 3 && size == 1) {
			System.out.println(makiato - sizeMoney); 
		} else {
			System.out.println(makiato + sizeMoney);
		}
		
		
		
		

	}

}
