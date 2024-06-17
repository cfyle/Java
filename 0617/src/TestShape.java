
public class TestShape {
	public static void main(String[] args) {
		Circle c1 = new Circle(5, 10, 10);
		Circle c2 = new Circle(7, 0, 0);
		
		System.out.println(c1.getArea());
		System.out.println(c2.getArea());
		
		Rectangle r1 = new Rectangle(10, 20, 30, 30);
		
		System.out.println(r1.getArea());
		
	}
}
