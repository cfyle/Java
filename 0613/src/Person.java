
public class Person {
	String name = "판호";
	int age = 22;
	
	
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "김판호";
		Person p2 = new Person();
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println();
		System.out.println(p2.name);
		System.out.println(p2.age);
		
		p2.name = "최형배";
		p2.age = 33;
		System.out.println();
		System.out.println(p2.name);
		System.out.println(p2.age);
	}
}
