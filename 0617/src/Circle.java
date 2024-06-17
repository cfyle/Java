// 원
// 반지름
// 중심점 좌표 x
// 중심점 좌표 y

// 생성자
// getter / setter
// getArea() : double

public class Circle {
	private int radius;
	private int centerX;
	private int centerY;
	
	public Circle(int radius, int centerX, int centerY) {
		super();
		this.radius = radius;
		this.centerX = centerX;
		this.centerY = centerY;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getCenterX() {
		return centerX;
	}

	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}

	public int getCenterY() {
		return centerY;
	}

	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}

	public double getArea() {
		return radius * radius * 3.14;
	}
	
	
}
