public class TestLocalClass32 {
	public static void main(String[] args) {
		Object o = new Object() {
			@Override
			public String toString() {
				return "익명의 클래스에서 재정의";
			}
		};
		System.out.println(o.toString());
	}
}
