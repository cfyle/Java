class Dog {
	// 상태 (state) : 객체가 각각 가지고 있는 값
	// 변수로 선언
	// 필드 (field) or 멤버변수 (member variable)
	int age;
}
public class TestObject2 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.age = 10;
		
		Dog d2 = new Dog();
		d2.age = 5;
	}
}
