interface Flyable {
	public abstract void fly();
}

// 새
class Bird {
}

// 오리
class Duck extends Bird implements Flyable {
	@Override
	public void fly() {
		System.out.println("오리가 파닥파닥 납니다");
	}
}

// 닭
class Chicken extends Bird {
}

class AirPlane implements Flyable {

	@Override
	public void fly() {
		System.out.println("비행기가 슈웅 납니다");
	}

}

public class TestBird {
	public static void main(String[] args) {
		Chicken chicken = new Chicken();
//		Flyable f = (Flyable) chicken;
//		chicken.fly();

		Duck duck = new Duck();
		duck.fly();

		Bird bird = new Duck();
//		bird.fly();

		Flyable flyable = new Duck();
		flyable.fly();
	}

}
