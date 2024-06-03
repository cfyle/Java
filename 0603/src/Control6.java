import java.util.Scanner;

// 500원 동전의 개수, 100원 동전의 개수를 각각 입력받아
// 총 금액을 출력하는 프로그램

// (이때 사용자가 음수의 개수를 입력하면, 연산결과가 아닌 안내메시지를 알려줘야한다)
public class Control6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("500원 동전의 개수는?");
		int coin500 = scanner.nextInt();
		System.out.println("100원 동전의 개수는");
		int coin100 = scanner.nextInt();

		if (coin500 >= 0 && coin100 >= 0) {
			coin500 *= 500;
			coin100 *= 100;
			int sum = coin500 + coin100;
			System.out.println("총 금액은 : " + (sum));
		} else {
			System.out.println("동전의 개수는 음수가 될 수 없습니다");
		}
	}
}
