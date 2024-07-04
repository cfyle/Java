class Circle {
	int radius;
	public static final double PI = 3.14;
	
	public double getArea() {
		return radius * radius * PI;
	}
}

public class TestCircle {
	public static void main(String[] args) {
		System.out.println(Circle.PI);
	}
}
