// 동물
// 동물은 소리를 낼 수 있다.
abstract class Animal {
	public abstract void sound();
	
}

class Dog extends Animal {

	@Override
	public void sound() {
		System.out.println("멍멍");
	}

	
}
// 강아지 is 동물
// 강아지는 소리를 낼 수 있다. { "멍멍"}


class Cat extends Animal {

	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
}
// 고양이 is 동물
// 고양이는 소리를 낼 수 있다. {"야옹"}






public class TestAnimals {
	public static void main(String[] args) {
//		Animal a = new Animal();
		Dog dog = new Dog();
		Animal animal = new Dog();
		animal.sound();
		
		Animal ani2 = new Cat();
		ani2.sound();
	}
}
