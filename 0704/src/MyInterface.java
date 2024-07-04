// 인터페이스는 필드를 가질 수 없고
// 메소드는 추상 메소드만 가질 수 있다

public interface MyInterface {
	public abstract void printHello();
}
class YourImple implements MyInterface {

	@Override
	public void printHello() {
		System.out.println("Hello");
	}
	
}

// 인터페이스 구현
class MyImple implements MyInterface {

	@Override
	public void printHello() {
		System.out.println("안녕하세요");
	}
}
