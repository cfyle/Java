// 새는 소리를 낼 수 있고, 날 수 있는 동물입니다

// 참새는 소리를 "짹짹" 낼 수 있고, 날 수 있는 새입니다

// 오리는 소리를 "꽥꽥" 낼 수 있고, ("퍼덕퍼덕" 날 수 있는 새 입ㄴ디ㅏ

abstract class Bird extends Animal {
	public abstract void fly();
}

class Sparrow extends Bird {

	@Override
	public void fly() {
		System.out.println("참새는 파닥파닥 납니다");
	}

	@Override
	public void sound() {
		System.out.println("짹짹");
	}
	
}

class Duck extends Bird {

	@Override
	public void fly() {
		System.out.println("오리는 퍼덕퍼덕 납니다");
	}

	@Override
	public void sound() {
		System.out.println("꽥꽥");
	}
	
}
class Chicken extends Bird {

	@Override
	public void fly() {
		
	}

	@Override
	public void sound() {
		
	}
	
}





public class TestAnimals2 {
	public static void main(String[] args) {
		Bird b = new Sparrow();
		b.fly();
		b.sound();
		
		Animal a = new Duck();
		((Bird)a).fly();
		a.sound();
	}
}
