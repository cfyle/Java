package origin;

public class MySuper {
	private int a;
	int b;
	public int c;
	protected int d; // 자식클래스 접근 가능
}

class MySub extends MySuper {
	public void printAll() {
//		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}


