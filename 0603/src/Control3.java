import java.util.Scanner;
// ctrl + shift + o

public class Control3 {
	public static void main(String[] args) {
		// 사용자에게 점수(정수)를 입력받아
		// 80점 이상이면 합격 메시지 출력
		// 80점 미만이면 불합격 메시지를 출력하는 프로그램

		Scanner scanner = new Scanner(System.in);

		System.out.println("점수를 입력하세요.");

		int num = scanner.nextInt();
		
		final int CUTLINE = 70;
		// 이름 한번에 바꾸기 : shift + alt + R

		if (num >= CUTLINE) {
			System.out.println(num + "점 합격입니다.");
		} else {
			System.out.println(num + "점 불합격입니다.");
			System.out.println("부족한 점수는 " + (CUTLINE - num) + "점 입니다.");
		}
	}
}
