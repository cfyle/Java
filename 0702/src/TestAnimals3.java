
public class TestAnimals3 {
	public static void main(String[] args) {
		Cat cat = new Cat("나비", 3);
		Dog dog = new Dog("바둑이", 4);
		Lion lion = new Lion("심바", 5, 250);
		
		Animal[] array = new Animal[] { cat, dog, lion };
		
		for (Animal a : array) {
			System.out.println(a.getName());
			// Dog 
//			Dog down = (Dog a);
		}
	}
}
