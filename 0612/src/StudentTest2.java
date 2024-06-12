import java.util.Scanner;

public class StudentTest2 {
	int kor;
	int eng;
	int math;
	
	public int getSum() {
		return kor + eng + math;
	}
	
	public double getAvg() {
		return kor + eng + math / 3;
	}
	
	public static void main(String[] args) {
		// 학생 한 명의 국, 영, 수 점수를 입력받아
		// 총점과 평균을 출력하는 프로그램
		// (단, 점수는 0 ~ 100 사이여야 한다.)
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		System.out.println("학생의 국어, 영어, 수학 점수를 입력하세요");
		student.kor = scanner.nextInt();
		student.eng = scanner.nextInt();
		student.math = scanner.nextInt();
		
		NumberChecker check = new NumberChecker();
		
		if (check.isBetweenZeroHundered(student.kor) &&
				check.isBetweenZeroHundered(student.eng) &&
				check.isBetweenZeroHundered(student.math)) {
			System.out.println("학생의 총점 : " + student.getSum());
			System.out.println("학생의 평균 : " + student.getAvg());
		} else {
			System.out.println("점수는 0 ~ 100 사이의 수여야 합니다");
		}
		
		
//		System.out.println("학생의 총점 : " + student.getSum());
//		System.out.println("학생의 평균 : " + student.getAvg());
		
	}
}
