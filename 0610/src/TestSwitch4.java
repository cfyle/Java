import java.util.Scanner;

public class TestSwitch4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("달의 영단어를 입력해주세요 (3글자)");
		String word = scan.nextLine();
		
		// Jan => 1, Feb => 2, Mar => 3, ...
		switch (word) {
		case "Jan":
			System.out.println("1월");
			break;
		case "Feb":
			System.out.println("2월");
			break;
		case "Mar":
			System.out.println("3월");
			break;
		}
		
	}
}
