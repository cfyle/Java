class MyClass { // static class (정적 클래스)
	private int num;
	
	class NonStaticClass {} // non-static class
	
	static class StaticClass { // static class
//		public void printNum() {
//			System.out.println(num);
//		}
	}
}

public class TestStaticClass {
	public static void main(String[] args) {
		new MyClass().new NonStaticClass();
		
		MyClass.StaticClass staticClass = new MyClass.StaticClass();
		
	}
}
