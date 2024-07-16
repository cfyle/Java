import java.util.InputMismatchException;

public class MultiCatch2 {
	public static void main(String[] args) {
		try {
			
		} catch (ArithmeticException | InputMismatchException e) {
			System.out.println("동일한 예외 처리 방식일 때 사용할 수 있어요");
		} catch (RuntimeException e) {
			System.out.println("위 2개를 제외한 런타임 예외 처리 방식 구현");
		}
	}
}
