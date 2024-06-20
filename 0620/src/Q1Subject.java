import java.util.Scanner;

public class Q1Subject {
	Scanner s = new Scanner(System.in);

	private Q1Class[] subjects;
	
	public Q1Subject() {
		subjects = new Q1Class[] {
			new Q1Class("name1", 50, 60, 70)
			, new Q1Class("name2", 60, 70, 80)
			, new Q1Class("name3", 80, 90, 100)
		};
	}
	
	public Q1Class[] getSubjects() {
		return subjects;
	}

	public void setSubjects(Q1Class[] subjects) {
		this.subjects = subjects;
	}

	// 이름 출력
	public void printSubject() {
		System.out.println("이름");
		for (int i = 0; i < subjects.length; i++) {
			System.out.println(subjects[i].getName());
		}
	}
	
	// 이름 입력
	public void inputName(String name) {
		subjects[0].setName(name);
	}
	
	// 국어 점수 입력
	public void inputKorScore(int score) {
		subjects[0].setKor(score);
	}
	
	// 영어 점수 입력
	public void inputEngScore(int score) {
		subjects[0].setEng(score);
	}
	
	// 수학 점수 입력
	public void inputMathScore(int score) {
		subjects[0].setMath(score);
	}
	
	// 점수 출력
	public void printScore(int score) {
		System.out.println(subjects[score].getName() + "님");
		System.out.println("국어 점수 : " + subjects[score].getKor());
		System.out.println("영어 점수 : " + subjects[score].getEng());
		System.out.println("수학 점수 : " + subjects[score].getMath());
	}
	
	// 평균
	public void Avg(int avg) {	
		avg = (subjects[0].getKor() + subjects[0].getEng() + subjects[0].getMath()) / 3; 
		System.out.println("평균 점수 : " + avg);
	}
	
	// 모든 평균
	public void allAvg(int allAvg) {
		int allSum = 0;
		for (int i = 0; i < 3; i++) {
			allSum = (subjects[i].getKor() + subjects[i].getEng() + subjects[i].getMath());
		}
		allAvg = allSum / 9;
		System.out.println(allAvg);
	}
	
	
}
