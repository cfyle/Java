import java.util.Scanner;

public class TestLocalClass31 {
	public static void main(String[] args) {
		class MyIntInputUtility {
			private Scanner scanner = new Scanner(System.in);
			public int input() {
				System.out.println("정수 입력");
				return scanner.nextInt();
			}
		}
		MyIntInputUtility m = new MyIntInputUtility();
		int result = m.input();
		
		System.out.println(result);
	}
}
