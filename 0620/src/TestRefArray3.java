class Student {
	private String name;
	private int age;
	private int score;

	public Student(String name, int age, int score) {
		super();
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
}

public class TestRefArray3 {
	public static void main(String[] args) {
		// 길동 학생, 33세, 100점
		Student s1 = new Student("길동", 33, 100);
		// 둘리 학생, 22세, 90점
		Student s2 = new Student("둘리", 22, 90);

		// 배열에 값 넣기
		Student[] arr = new Student[2];
		arr[0] = s1;
		arr[1] = s2;
		System.out.println(arr[0].getName());
		System.out.println(arr[1].getName());
		arr[0].setName("고길동");
		
		System.out.println(s1.getName());
	}
}
