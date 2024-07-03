
public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person("최형배", 22);
		Person p2 = new Person("최익현", 33);
		Person p3 = new Person("최형배", 22);
		Person p4 = new Person("최익현", 50);
		
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p4));
		
		
	}
}
