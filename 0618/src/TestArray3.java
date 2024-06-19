import java.util.Scanner;

// 사용자에게 정수 5개를 입력받아
// 입력받은 순서의 역순으로 출력하는 프로그램

public class TestArray3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] numbers = new int[5];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("정수입력");
			numbers[i] = scan.nextInt();
		}
		
	
		
		for(int i = numbers.length - 1; i >= 0; i--) {
			System.out.println(numbers[i]);
		}
	}
}
