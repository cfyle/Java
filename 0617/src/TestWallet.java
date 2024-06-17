// 고객 Customer
// 고객명 : String
// 지갑 : Wallet

class Customer {
	private String customerName;
	private Wallet wallet;

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	public Customer(String customerName, Wallet wallet) {
		super();
		this.customerName = customerName;
		this.wallet = wallet;
	}

	public Customer(String customerName) {
		super();
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public int getMoney() {
		return wallet.getMoney();
	}
	public void pay(int money) {
		wallet.setMoney(wallet.getMoney() - money);
	}

}

// 지갑 Wallet
// 현재 돈 : int

class Wallet {
	private int money;

	public Wallet(int money) {
		super();
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
}

public class TestWallet {
	public static void main(String[] args) {

		Wallet wallet = new Wallet(10000);
		System.out.println(wallet.getMoney());
		
		wallet.setMoney(wallet.getMoney()-2000);
		System.out.println(wallet.getMoney());
		
		Customer cus = new Customer ("길동", wallet);
		System.out.println(cus.getWallet().getMoney());
		System.out.println(cus.getMoney());
		
		cus.pay(3000);
		
		System.out.println(cus.getMoney());
		
	}
}
