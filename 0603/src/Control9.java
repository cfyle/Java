import java.util.Scanner;

// 정수 입력을 받아서
// 학점 출력하는 프로그램

// (단, 사용자의 점수는 0 ~ 100 사이의 값이어야만 한다.)

public class Control9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int score = scanner.nextInt();

		if (90 <= score && score <= 100) {
			System.out.println("A학점");
		} else if (score >= 80 && score < 90) {
			System.out.println("B학점");
		} else if (score >= 70 && score < 80) {
			System.out.println("C학점");
		} else if (score >= 60 && score < 70) {
			System.out.println("D학점");
		} else if (score <= 50 && score >= 0){
			System.out.println("F학점");
		} else {
			System.out.println("0 ~ 100 을 벗어나는 범위는 사용할 수 없습니다.");
		

		// -------------------------------------
//		if (0 >= score || score >= 100) {
//			if (90 <= score && score <= 100) {
//				System.out.println("A학점");
//			} else if (score >= 80) {
//				System.out.println("B학점");
//			} else if (score >= 70) {
//				System.out.println("C학점");
//			} else if (score >= 60) {
//				System.out.println("D학점");
//			} else if (score <= 50) {
//				System.out.println("F학점");
//			} else {
//				System.out.println("0 ~ 100 을 벗어나는 범위는 사용할 수 없습니다.");
			}

		}

	}

