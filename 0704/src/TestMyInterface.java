
public class TestMyInterface {
	public static void main(String[] args) {
//		MyInterface my = new MyInterface();
		
		MyInterface my = new MyImple();
		my.printHello();
		
		MyInterface your = new YourImple();
		your.printHello();
	}
}
