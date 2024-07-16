public class TestExceptionHirechy {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		
		try {
			int result = a / b;
		} catch (ArithmeticException e) {
			System.out.println("예외 처리 블럭 실행");
			System.out.println("예외 메세지 : " + e.getMessage());
		}
		
		System.out.println("프로그램 정상 종료");
	}
}
