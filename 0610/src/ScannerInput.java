import java.util.Scanner;

public class ScannerInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자열 입력");
		scan.nextLine();
		String str = scan.nextLine();
		
		System.out.println("정수 입력");
		int num = scan.nextInt();
		
		System.out.println("입력 문자열 : " + str);
		System.out.println("입력 정수 : " + num);
	}
}
