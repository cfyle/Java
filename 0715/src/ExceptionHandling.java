class Calculator {
	public int divide(int left, int right) {

		return left / right;

	}
}

public class ExceptionHandling {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		try {
			calculator.divide(10, 0);
		} catch (Exception e) {
			System.out.println("파라미터 입력값이 잘못되어 나눌 수 없음");
		}
	}
}
