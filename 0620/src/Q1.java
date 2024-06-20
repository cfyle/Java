import java.util.Scanner;

//
// 1. 학생 점수 관리 프로그램
// 1-1. 학생의 이름, 국, 영, 수 점수를 입력받을 수 있음.
// 1-2. 각 학생의 정보를 확인 가능함.
// 1-3. 각 학생의 평균 점수를 확인 가능함.
// 1-4. 모든 학생의 평균 점수를 확인 가능함.
//
// (학생 수는 총 3명)
//
// 2. 1번의 프로그램에 추가 학생 등록 기능을 구현하고자 합니다.
//

public class Q1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Q1Subject q = new Q1Subject();
		
		for(int i = 0; i < 3; i++) {
			
			System.out.println("이름을 입력하세요");
			String inputName = scan.next();
			q.inputName(inputName);
			
			System.out.println("국어 점수를 입력하세요");
			int inputKorScore = scan.nextInt();
			q.inputKorScore(inputKorScore);
			
			System.out.println("영어 점수를 입력하세요");
			int inputEngScore = scan.nextInt();
			q.inputEngScore(inputEngScore);
			
			System.out.println("수학 점수를 입력하세요");
			int inputMathScore = scan.nextInt();
			q.inputMathScore(inputMathScore);
		}
		
		
//		q.printScore(0);
		q.allAvg(0);
	
		
	}
}
