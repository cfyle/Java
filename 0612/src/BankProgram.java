import java.util.Scanner;

public class BankProgram {
	public static void main(String[] args) {
		// 사용자가
		// 1. 입금 2. 출금 3. 현재 잔고 확인
		// 메뉴를 통해 조작할 수 있는 콘솔 프로그램
		
		// 문제점1) 종료가 없다  -> 고쳤지만 안내메시지가 없다
		// 문제점2) 금액 문제가 있을 때, 안내 메시지가 없어 알기 어렵다
		// 문제점3) 음수 입금 가능

		Scanner scanner = new Scanner(System.in);
		BankAccount acc = new BankAccount();
		acc.money = 0;
		boolean go = true;
		while (go) {
			System.out.println("1.입금 2.출금 3.현재잔고확인 4.종료");
			int menu = scanner.nextInt();

			switch (menu) {
			case 1:
				System.out.println("입금할 금액을 입력하세요");
				int m = scanner.nextInt();
				System.out.println(acc.deposit(m));
				break;

			case 2:
				System.out.println("출금할 금액을 입력하세요");
				int m2 = scanner.nextInt();
				System.out.println(acc.withdraw(m2));
				break;

			case 3:
				int currentMoney = acc.getCurrentMoney();
				System.out.println("현재 잔고는 " + currentMoney);
				break;
				
			case 4:
				go = false;
				System.out.println("프로그램을 종료합니다.");
				break;

			default:
				System.out.println("잘못된 입력입니다");
			}
		}
	}
}
