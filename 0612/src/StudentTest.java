
public class StudentTest {
	public static void main(String[] args) {
		Student 김판호 = new Student();
		
		김판호.kor = 100;
		김판호.eng = 100;
		김판호.math = 100;
		
		Student 최익현 = new Student();
		최익현.kor = 90;
		최익현.eng = 90;
		최익현.math = 90;
		
		김판호.printSum();
		최익현.printSum();
		
		System.out.println("김판호 평균 : " + 김판호.getAvg());
		
		int total = 김판호.getSum() + 최익현.getSum();
		System.out.println("두 학생의 총점: " + total);
	}
}
