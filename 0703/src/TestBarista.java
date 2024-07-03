// 바리스타
// 커피를 생성해서 반환할 수 있음
class Barista {
	public Coffee makeCoffee(String menuName) {
		if (menuName.equals("아메리카노")) {
			return new Americano(1);
		} else if (menuName.equals("카페라떼")) {
			return new CaffeLatte(2, 50);
		}
		return null;
	}
}

// 커피는 다음과 같음
// 아메리카노 (에스프레소 샷 개수)
// 카페라떼 (에스프레소 샷 개수, 우유 용량)
// 카페모카 (에스프레소 샷 개수, 우유 용량, 초콜릿 용량)

abstract class Coffee {
	private int shotCount;

	public Coffee(int shotCount) {
		super();
		this.shotCount = shotCount;
	}

	public int getShotCount() {
		return shotCount;
	}

	public void setShotCount(int shotCount) {
		this.shotCount = shotCount;
	}

}

class Americano extends Coffee {

	public Americano(int shotCount) {
		super(shotCount);
	}

}

class CaffeLatte extends Coffee {
	private int milk;

	public CaffeLatte(int shotCount, int milk) {
		super(shotCount);
		this.milk = milk;
	}

	public int getMilk() {
		return milk;
	}

	public void setMilk(int milk) {
		this.milk = milk;
	}

}

public class TestBarista {
	public static void main(String[] args) {
		Barista barista = new Barista();
		Coffee americano = (Americano) barista.makeCoffee("아메리카노");

		CaffeLatte caffelatte = (CaffeLatte) barista.makeCoffee("카페라떼");
		System.out.println(caffelatte.getMilk());

	}
}
