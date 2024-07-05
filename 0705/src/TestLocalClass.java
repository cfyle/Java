
public class TestLocalClass {
	public static void main(String[] args) {
		// x, y 좌표를 가지는 Point2D class
		class Point2D {
			int x;
			int y;
		}

		Point2D instance = new Point2D();
		instance.x = 10;
		instance.y = 20;

		System.out.println(instance.x);
		System.out.println(instance.y);

	}
}
