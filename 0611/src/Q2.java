//  3. 삼각형 클래스 작성 및 객체 테스트
//     상태: 밑변, 높이
//     기능: 넓이를 구해 콘솔 출력하는 기능
 
public class Q2 {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		
		t.length = 15;
		t.height = 20;
		
		int area = t.Area();
		
		System.out.println("삼각형의 넓이는 " + area);
	}
}
