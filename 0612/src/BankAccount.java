// 은행 계좌 클래스
// 상태
// 현재 잔고 : int

// 행동
// 입금(int) : void
// 출금(int) : void
// 현재잔고확인() : int
public class BankAccount {
	int money;
	
	
	
	public String deposit(int m) {
		if (m > 0) {
		money += m;
		return m + "원이 정상적 입금 완료되었습니다";
		} else {
			return "입금 처리 되지 않았습니다";
		}
	}
	public String withdraw(int m) {
		if (m > 0 && money >= m) {
			money -= m;
			return m + "원이 정상적 출금 완료되었습니다";
		} else {
			return "출금 처리 되지 않았습니다";
		}
	}
	
	public int getCurrentMoney() {
		return money;
	}
	
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		account1.money = 10000;
		
		account1.deposit(5000);
		System.out.println(account1.getCurrentMoney());
		account1.withdraw(2000);
		System.out.println(account1.getCurrentMoney());
		
		account1.withdraw(-100000);
		System.out.println(account1.getCurrentMoney());
		
		account1.withdraw(50000);
		System.out.println(account1.getCurrentMoney());
	}
}
