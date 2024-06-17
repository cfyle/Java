public class TestShape2 {
	public static void main(String[] args) {
		Circle c1 = new Circle(5, 0, 0);
		
		Point2D origin = new Point2D(0, 0);
		CircleHasPoint c2 = new CircleHasPoint(5, origin);
		
		System.out.println(c2.getRaidus());
		System.out.println(c2.getCenter().getX());
		System.out.println(c2.getCenter().getY());
	}
}
