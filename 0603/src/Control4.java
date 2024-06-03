// 사용자에게 정수 2개를 입력받아
// 큰 수 - 작은 수의 결과를 출력하기

// 입력예) 5 12 => 출력예) 7
// 입력예) 15 12 => 출력예) 3
import java.util.Scanner;

public class Control4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 2개 입력하세요.");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if (x < y) {
			int z = x;
			x = y;
		    y = z;
		}
		System.out.println(x - y);
		
//		if (x >= y) {
//			int result = x - y;
//			System.out.println(result);
//		} else if (x <= y) {
//			int result2 = y - x;
//			System.out.println(r);
//		}
		
	}

}
