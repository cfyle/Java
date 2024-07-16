import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 사용자에게 정수를 5번 입력받아
// 중복되지 않는 고유한 정수 목록을 출력하기

// 1, 1, 3, 4, 4 => 1, 3, 4

public class TestDuplicate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();
		List<Integer> duplicated = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("정수를 입력하세요");
			int userInput = scanner.nextInt();
			numbers.add(userInput);
			if(!numbers.contains(userInput)) {
				numbers.add(userInput);
//			} else {
//				(userInput) {
//					
//				}
			}
			
		}
		System.out.println(numbers);
	}
}
