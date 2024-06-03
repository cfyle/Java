// 사용자에게 음료의 양(정수)를 입력받아
// 100 이상 ~ 200 미만 small
// 200 이상 ~ 300 미만 medium
// 300 이상 ~ 400 미만 Large
// 컵 사이즈 출력하기
import java.util.Scanner;

public class Control10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("음료의 양 입력하세요");
		int size = scanner.nextInt();

		if (300 <= size && size < 400) {
			System.out.println("large 사이즈");
		} else if (200 <= size && size < 300) {
			System.out.println("medium 사이즈");
		} else if (100 <= size && size < 200) {
			System.out.println("small 사이즈");
		} else {
			System.out.println("맞는 컵 사이즈가 없습니다.");
		}
	}
}
