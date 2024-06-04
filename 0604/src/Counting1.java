import java.util.Scanner;

/*
 * 	사용자에게 정수를 5번 입력받아
 * 	입려고딘 정수 중, 음수의 개수를 출력해보세요 
 */
public class Counting1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 5개 입력");
		
		int i = 0;
		int count = 0;
		while (i < 5) {
			int num = scanner.nextInt();
			
			if (num < 0) {
				count++;
			}
			i++;
		}
		System.out.println("접게된 음수의 개수 : " + count);
		System.out.println("프로그램 종료");

	}
}
