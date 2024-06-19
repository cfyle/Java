package my;

public class MyMain {
	public static void main(String[] args) {
		MyClass my = new MyClass();
		
		my.field2 = "같은 패키지 내부라 접근이 허용됨.";
		System.out.println(my.field2);
	}
}
