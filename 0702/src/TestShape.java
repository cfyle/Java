class Shape {
	public void printArea() {
		System.out.println("도형의 넓이는 : ");
	}
}

// 삼각형
// 높이 : int
// 밑변 : int
// 넓이 출력 기능 : void

class Triangle extends Shape {
	int height;
	int length;
	
	@Override
	public void printArea() {
		System.out.println("삼각형의 넓이는 : " + (height * length / 2));
	}
	
}


// 직사각형
// 가로 : int
// 세로 : int
// 넓이 출력 기능 : void

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

class Circle extends Shape {
	int radius;
}




public class TestShape {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.length = 20;
		t.height = 20;
		
		t.printArea();
		
		Square s = new Square();
		s.width = 5;
		s.height = 10;
		
		s.printArea();
		
		// 다형성
		Shape shape1 = t;
		Shape shape2 = s;
		
		shape1.printArea();
		shape2.printArea();
		
		
		
	}
}
