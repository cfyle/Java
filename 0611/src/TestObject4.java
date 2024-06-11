// 학생 클래스 작성
// 상태 : 국어, 영어, 수학 점수

class Student {
	int kor;
	int eng;
	int math;
}

public class TestObject4 {
	public static void main(String[] args) {
		Student s = new Student();
		s.kor = 60;
		s.eng = 70;
		s.math = 80;
		
		System.out.println(s.kor + s.eng + s.math);
		
	}
}
