// 학생
// 이름 : String
// 나이 : int
// 점수 : int

// 모든 필드를 private 선언하여 가시성을 조절하고
// 생성자로 모든 필드를 초기화 하는 생성자 정의

// 상태 변경 불가능 객체
public class Student {
	private String name;
	private int age;
	private int score;
	
	public Student(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("김판호", 22, 100);
		s1.name = "최형배";
		System.out.println(s1.name);
	}
}
