import java.util.Scanner;

public class ScannerInput3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수입력");
		int num = scanner.nextInt();
		
		System.out.println("문자열 입력");
		String word1 = scanner.next();
		String word2 = scanner.next();
		String word3 = scanner.next();
		
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
	}
}
