class SomeClass {
	int num;

	static int i;
	
	public void print() {
		System.out.println("인스턴스 메소드에서");
		System.out.println("필드 접근 : " + num);
		System.out.println("전역 변수 접근 : " + i);
		staticPrint();
	}
	public static void staticPrint() {
		System.out.println("정적 메소드에서");
		System.out.println("전역 변수 접근 : " + i);
//		System.out.println("필드 접근? " + num); // 접근 x
//		print();
	}
}

public class TestStatic {
	public static void main(String[] args) {
		
	}
}
