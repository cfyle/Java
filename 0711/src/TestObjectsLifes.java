public class TestObjectsLifes {
	public static void main(String[] args) {
		int a = 10;

		{
			int inner = 100;
		}

		Object o = new Object();

		{
			Object anotherRef = new Object();
		}
	}
}
