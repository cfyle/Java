import java.util.Scanner;

public class ScannerInput2 {
	public static void main(String[] args) {
		System.out.println("정수 3개를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		System.out.println("문자열 2줄을 입력하세요.");
		scanner.nextLine();
		String line1 = scanner.nextLine();
		String line2 = scanner.nextLine();
		
		System.out.println(line1);
		System.out.println(line2);
	}
}
