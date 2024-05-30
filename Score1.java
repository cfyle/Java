// 사용자의 국어, 영어, 수학 점수를 입력받아
// 총점과 평균을 출력해보세요

// (정수 데이터 활용)

import java.util.Scanner;

public class Score1 {
	

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("국어 점수는");
	int kr = scan.nextInt();
	
	System.out.println("영어 점수는");
	int eg = scan.nextInt();
	
	System.out.println("수학 점수는");
	int mt = scan.nextInt();
	
	int sum = (kr + eg + mt);
	double average = (double)sum / 3;
	
	System.out.println("총점은 : " + sum + "점, 평균은 : " + average + "점 입니다.");
	
	// System.out.println("총점은 : " + (kr + eg + mt));
	
	// System.out.println("평균은 : " + ((kr + eg + mt) / 3));
	
	
	}
}