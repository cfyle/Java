//class MinusDepositException extends 
public class TestBankAccount {
	private int money;
//
//	public MinusDepositException (String message, int value) {
//		super(message + ", 입력값 : " + value);
//	}

	public TestBankAccount(int money) {
		super();
		this.money = money;
	}

	public boolean deposit(int amount) {
		if (amount >= 0) {
			money += amount;
			return true;
		} else {
			throw new RuntimeException("마이너스 입급을 할 수없습니다");
		}
	}

	public static void main(String[] args) {
//		TestBankAccount t = new TestBankAccount();
//
//		t.deposit(10000);
//
//		t.deposit(-3000);
//
//		System.out.println(t.money);
	}
}
