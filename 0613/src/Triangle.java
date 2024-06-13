
public class Triangle {
	int width;
	int height;
	
	public Triangle(int w, int h) {
		width = w;
		height = h;
	}
	
	public static void main(String[] args) {
		// 클래스에 생성자를 하나 이상 정의하면,
		// 컴파일러는 기본생성자를 자동적으로 정의하지 않습니다.
//		Triangle t = new Triangle(); 
		
		Triangle t1 = new Triangle(10, 5);
		
		System.out.println(t1.width);
		
		System.out.println(t1.height);
	}
}
