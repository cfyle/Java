abstract class Shape {
	public abstract void printArea();
}

class Triangle extends Shape {
	int height;
	int length;

	
	public Triangle(int height, int length) {
		super();
		this.height = height;
		this.length = length;
	}


	@Override
	public void printArea() {
		System.out.println("삼각형의 넓이는 : " + (height * length / 2));
	}

}


class Square extends Shape {
	int width;
	int height;

	@Override
	public void printArea() {
		System.out.println("사각형의 넓이는 : " + (width * height));
	}
}

// 원
// 반지름 : int
// 넓이 출력 기능 : void

//class Circle extends Shape {
//	int radius;
//}

public class TestShape {
	public static void main(String[] args) {
		Shape shape1 = new Triangle(20, 20);
		shape1.printArea();

	}
}
