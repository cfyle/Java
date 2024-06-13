// 학생
// 이름 : String
// 국어 : int
// 영어 : int
// 수학 : int

// 모든 필드를 초기화 하는 생성자

// 이름 필드만 초기화 하는 생성자2 (점수는 기본값 활용)

// 총점을 반환하는 메소드 : int

public class Student {
	String name;
	int kor;
	int eng;
	int math;

	public Student(String name) {
		this(name, 0, 0, 0);
//		this.name = name;
//		kor = 0;
//		eng = 0;
//		math = 0;
	}

	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {          // getter (접근자)
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public void setName(String name) {          // setter (설정자)
		this.name = name;
	}

	public void setKor(int kor) {
		if (kor >= 0) {
			this.kor = kor;
		}
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return kor + eng + math;
	}

	public static void main(String[] args) {
		Student s = new Student("김판호", 70, 80, 90);

		s.setName("최익현");
		s.setKor(-30); // 변경되지 않음
		s.setEng(80);
		s.setMath(80);

		System.out.println(s.name + " 님의 점수의 총합은 : " + s.getSum());
		System.out.println(s.name);
		System.out.println(s.kor);
		System.out.println(s.getKor());
		System.out.println(s.eng);
		System.out.println(s.math);

		s.kor = 50;
		System.out.println(s.kor);

		Student s2 = new Student("최형배");
		System.out.println(s2.getSum());
	}
}
