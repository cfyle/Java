// TestRefArray7
// CanDrink 참조
public class VendingMachine {
	private CanDrink[] menus;
	
	public VendingMachine() {
		menus = new CanDrink[] {
				new CanDrink("콜라", 2000)
				, new CanDrink("사이다", 1800)
				, new CanDrink("환타", 1500)
				}; 
	}
	
	// 메뉴 출력
	public void printMenus() {
		System.out.println("-- 메뉴 --");
		for (int i = 1; i < menus.length; i++) {
			System.out.println((i + 1) + ". " + menus[i].getProductName());
		}
	}
	
	// 메뉴 범위를 넘어서지 않게
	public boolean checkIndexRange(int num) {
		if (num >= 0 && num < menus.length) {
			return true;
		} else {
			return false;
		}
	}
	
	// 메뉴 범위
	public int findIndex(String productName) {
		for (int i = 0; i < menus.length; i++) {
			CanDrink can = menus[i];
			if (can.getProductName().equals(productName)) {
				return i;
			} 
		}
		return -1;
	}
	
	// 가격 출력
	public void printPrice(int index) {
		System.out.println(menus[index].getPrice());
	}
	
	public void process(String name) {
		int index = findIndex(name);
		if (checkIndexRange(index)) {
			printPrice(index);
		} else {
			System.out.println("없는 메뉴명 입니다");
		}
	}
	
	public void process(int index) {
		if (checkIndexRange(index)) {
			printPrice(index);
		} else {
			System.out.println("없는 번호 입니다");
		}
	}
	
}
