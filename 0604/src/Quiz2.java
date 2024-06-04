//2. 사용자에게 정수 n, m 을 입력받아 => n의 m제곱수 출력
//예) n=2 m=4   => 2x2x2x2x2

// 3     1
// 9     2
// 27    3
// 81    4
// 243   5

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		// n = 3 / m = 3 
		int length = 1;
		int square = 1;
		while (length <= m) {
			square = square * n;
			length++;
		} 
		System.out.println(square);
	}
}
