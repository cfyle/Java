import java.util.Scanner;

public class Loop4 {
	public static void main(String[] args) {
		// 상용자에게 정수를 입력받아
		// 입력받은 만큼
		// "안녕" 메세지를 출력하는 프로그램
		
		// 입력예) 3
		// 출력예) 안녕 안녕 안녕
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇 번 반복할까요?");
		int userInput = scanner.nextInt();
		
		int i = 1;
		
		while (i <= userInput) {
			System.out.print("안녕 ");
			i++;
		}
		
		
		
		
	}
}
