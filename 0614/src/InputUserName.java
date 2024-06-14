import java.util.Scanner;

public class InputUserName {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 (First Name)을 입력해 주세요");
		String firstName = scanner.nextLine();
		System.out.println("성 (Last Name)을 입력해주세요");
		String lastName = scanner.nextLine();
		
		// '통과' | '잘못된 입력'
		// 이름에는 공백이 있으면 안됩니다
		// 각 이름은 최소 1 ~ 최대 10자
		// Min
		// Park		
		// P. M.
		
		NameChecker checker = new NameChecker();
		if (!checker.check(firstName) || !checker.check(lastName)) {
			System.out.println("잘못된 입력");
			return;
		}
		
		char firstLetter1 = firstName.charAt(0);
		char firstLetter2 = lastName.charAt(0);
		
		System.out.println(firstLetter2 + ". " + firstLetter1 + ".");
		
//		// 이름 공백
//		if (firstName.indexOf(" ") == -1) {
//			System.out.println("잘못된 입력");
//		}
//		
//		// 최대 10 자
//		if (lastName.length() <= 10 && firstName.length() <= 10) {
//			System.out.println("각 이름은 최소 1 ~ 10 자를 입력해주세요");
//		}
	}
}
