
public class TestConstructor {
	public TestConstructor() {
		System.out.println("메소드의 호출 가능");
		for (int i = 0; i < 5; i++) {
			ownMethod();
		}
	}
	
	public void ownMethod() {
		System.out.println("자기 메소드");
	}
	
	
	
	
	public static void main(String[] args) {
		TestConstructor t = new TestConstructor();
	}
}
