
public class Human {
	String name;
	int age;
	// 생성자 (constructor) : 객체의 필드를 초기화 함.
	public Human(String n, int a) {
		name = n;
		age = a;
	}
	
	public static void main(String[] args) {
		Human h1 = new Human("김판호", 30);
		Human h2 = new Human("최형배", 22);
		
		System.out.println(h1.name);
		System.out.println(h1.age);
		System.out.println();
		System.out.println(h2.name);
		System.out.println(h2.age);
	}
}
