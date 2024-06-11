// 사람을 표현할 수 있는 클래스를 작성해보자
// 이름, 나이를 상태로 가진다.

class Human {
	String name;
	int age;
}

public class TestObject3 {
	public static void main(String[] args) {
		Human h = new Human();
		h.name = "김판호";
		h.age = 22;
		
		Human h2 = new Human();
		h2.name = "최형배";
		h2.age = 22;
	}
}
