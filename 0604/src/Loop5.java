// 사용자에게 단수를 입력받아
// 구구단을 출력하는 프로그램

// 입력예 ) 3
// 3 x 1 = 3
// 3 x 2 = 6
// 3 x 3 = 0
// ...
import java.util.Scanner;

public class Loop5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("단수를 입력하세요");
		int multiplecation = scanner.nextInt();
		
		int i = 1;
		
		while (i < 10) {
			System.out.println(multiplecation + " x " + i + " = " + (multiplecation * i));
			i++;
		}
	}
}
