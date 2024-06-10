public class MethodParameter4 {

	public static void plus(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public static void minus(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	
	public static void div(int num1, int num2) {
		if (num2 != 0) {
			System.out.println(num1 / num2);
		} else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println(num1 / num2);
	}

	public static void main(String[] args) {
		plus(10, 4);
		plus(16, 9);		
//		plus(10);          // 컴파일 오류
//		plus(1, 3, 5);     // 매개변수에 
//		plus();            // 크기가 같아야함
		
		minus(33, 22);
		
		div(10, 5);
		div(10, 3);
		
		
	}
}
