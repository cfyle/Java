public class TestAnimals {
	public static void main(String[] args) {
		Dog d = new Dog("바둑이", 4);
		
		System.out.println(d.getName());
		System.out.println(d.getAge());
		
		d.bark();
		
		Animal a = d;
		System.out.println(a.getName());
		System.out.println(a.getAge());
		
//		a.bark();
	}
}
