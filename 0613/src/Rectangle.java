
public class Rectangle {
	int width;
	int height;
	
	// 필드를 기본값으로 초기화
	public Rectangle() {
		// 기본값
		// 전수형 : 0
		// 실수형 : 0.0
		// 논리형 : false
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle();  // 기본 생성자 호출됨
		
		System.out.println(r.width);
		System.out.println(r.height);
	}
}
