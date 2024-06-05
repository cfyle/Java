
// 5. 자판기 프로그램(돈을 넣고 거스름돈반환버튼을 누를때까지 또는 돈을 소진할 때 까지)
import java.util.Scanner;

public class SumQ5 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		System.out.println("금액을 넣어주세요.");
		int money = scr.nextInt();

		System.out.println("다음 메뉴중 원하시는 메뉴를 선택해주세요.");
		System.out.println("1. 콜라 (2000원)");
		System.out.println("2. 사이다 (1800원)");
		System.out.println("3. 환타 (1700원)");
		System.out.println("4. 커피 (2500원)");
		System.out.println("환전 버튼은 10번을 눌러주세요");

		boolean go = true;
		int meanLess = 0;
		
		while (go && meanLess < 10) {
			int input1menu = scr.nextInt();
			if (input1menu == 1) {
				if (money >= 2000) {
					money -= 2000;
					System.out.printf("1번 콜라(2000원) 선택, 남은 금액은 %d원 입니다.\n", money);
				} else {
					meanLess++;
					System.out.printf("잔액이 부족합니다. \n남은 금액은 %d이며 환전을 원하시면 10을 입력해주세요 \n", money);
				}
			} else if (input1menu == 2) {
				if (money >= 1800) {
					money -= 1800;
					System.out.printf("2번 사이다(1800원) 선택, 남은 금액은 %d원 입니다.\n", money);
				} else {
					meanLess++;
					System.out.printf("잔액이 부족합니다. \n남은 금액은 %d이며 환전을 원하시면 10을 입력해주세요\n ", money);
				}
			} else if (input1menu == 3) {
				if (money >= 1700) {
					money -= 1700;
					System.out.printf("3번 환타(1700원) 선택, 남은 금액은 %d원 입니다.\n", money);
				} else {
					meanLess++;
					System.out.printf("잔액이 부족합니다. \n남은 금액은 %d이며 환전을 원하시면 10을 입력해주세요 \n", money);
				}
			} else if (input1menu == 4) {
				if (money >= 2500) {
					money -= 2500;
					System.out.printf("4번 커피(2500원) 선택, 남은 금액은 %d원 입니다.\n", money);
				} else {
					meanLess++;
					System.out.printf("잔액이 부족합니다. \n남은 금액은 %d이며 환전을 원하시면 10을 입력해주세요 \n", money);
				}
			} else if (input1menu == 10) {
				go = false;
			} else {
				meanLess++;
				System.out.println("정상적인 번호를 입력해주세요");
			}
			
			if (money == 0) {
				System.out.println("금액을 더 투입하시려면 1번.\n사용을 종료하시려면 1번을 제외한 숫자를 눌러주세요.");
				int last = scr.nextInt();
				if (last == 1) {
					System.out.println("투입할 금액을 입력해주세요");
					int plusmoney = scr.nextInt();
					money += plusmoney;
					System.out.println("원하는 메뉴를 선택해주세요");
				} else {
					go = false;
				}
			}
			
		}
		System.out.printf("거스름돈은 %d원 입니다.\n", money);
		System.out.println("자판기 프로그램 종료");
	}
}
