
public class MethodParameter {
	// 				      메소드 이름
	//						     메소드 파라미터
	public static void printNum(int num) {
		System.out.println(num);
	}
	public static void main(String[] args) {
		printNum(10);
		
		printNum(7);
		
		// System.out.println(num);   // 같은 지역에 있는 변수가 아님
		
		// printNum();  // 컴파일 에러 (파라미터 개수 일치하지 않음)
		
		// printNum(44.35);   // 컴파일 에러 (파라미터 타입 일치하지 않음
	}
}
