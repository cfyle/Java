import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 사용자가 콘솔입력으로 정수를 입력
// 정수 외의 입력을 했을 경우, 입력 종료

// 입력된 정수를 모두 출력 (최신의 값이 우선)
public class UserInputs {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();

		try {
			while (true) {
				System.out.println("정수를 입력해주세요");
				int userInput = scanner.nextInt();
				list.add(userInput);
				
			}
		} catch (Exception e) {
			System.out.println("정수를 입력하지 않았습니다");

		}
		
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}

	}
}
