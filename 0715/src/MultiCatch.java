import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int local = 100;
		int init;
			
		try {
			System.out.println("나눗셈 정수를 입력하세요");
			int left = scanner.nextInt();
			
			System.out.println("두번째 정수를 입력하세요");
			int right = scanner.nextInt();
			
			int result = left / right;
			
			System.out.println("몫 : " + result);
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력해주세요");
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없어요");
		} catch (RuntimeException e) {
			System.out.println("실행 중 예외가 발생했습니다");
		} finally {
			init = 100;
		}
		System.out.println(init);
		System.out.println(local);
	}
}
