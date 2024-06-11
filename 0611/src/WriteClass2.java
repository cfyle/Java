// 사각형의 넓이 , 둘레를 구하는 프로그램을 만들고자 합니다.

// 이때 필요한 직사각형의 클래스를 작성해봅시다.
// 상태로 무엇을 가지면 되까요?

class Square {
	int height;
	int width;
	int area;
	int circumference;
	
	public void Area() {
		area = width * height;
		System.out.println("직사각형의 넓이는 " + area);
	}
	
	public void Circumference() {
		circumference = (height + width) * 2;
		System.out.println("직사각형의 둘레는 " + circumference);
	}
}
public class WriteClass2 {
	public static void main(String[] args) {
		Square s = new Square();
		
		s.height = 10;
		s.width = 5;	
		
		s.Area();
		s.Circumference();
		
		Square s2 = new Square();
		s2.height = 20;
		s2.width = 10;
		
		s2.Area();
		s2.Circumference();
	}
}
