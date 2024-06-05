import java.util.Scanner;

// * 2. 피즈버즈 출력하기 ( 1 ~ 101)
// * (3의 배수는 Fizz, 5의 배수는 Buzz, 3의 배수이면서 5의 배수인 경우 Fizz Buzz)

public class Q2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int fizz = 3;
		int buzz = 5;

		System.out.println("정수 1~101을 입력하세요");
//		int num = s.nextInt();

		for (int i = 1; i < 102; i++) {

			if (i % fizz == 0 && i % buzz == 0) {
				System.out.println("Fizz Buzz");
			} else if (i % buzz == 0) {
				System.out.println("Buzz");
			} else if (i % fizz == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		}
	}
}
