
public class TestInitDog {
	public static void main(String[] args) {
		Dog d = new Dog("김판호", 3);
		Cat c = new Cat("최익현", 5);
		
		d.bark();
		
		System.out.println(d.getName());
		System.out.println(d.getAge());
		
		c.cry();
		System.out.println(c.getName());
		System.out.println(d.getAge());
	}
}
