class Student {
	String name;
	int[] scores;

	public Student(String name, int[] scores) {
		this.name = name;
		this.scores = scores;
	}

	public int getSum() {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
}

public class Test7 {
	public static void main(String[] args) {
		// 학생1
		// 이름: 김판호
		// 점수들 : 100, 90, 80
		Student s1 = new Student("김판호", new int[] { 100, 90, 80 });

		// 학생2
		// 이름: 최익현
		// 점수들 : 30, 20, 10
		Student s2 = new Student("최익현", new int[] { 30, 20, 10 });

		// 학생3
		// 이름: 최형배
		// 점수들 : 60, 50
		Student s3 = new Student("최형배", new int[] { 60, 50 });

		int[] nums = s2.getScores();
//		int sum = 0;
//		for (int i = 0; i < nums.length; i++) {
//			System.out.println(nums[i]);
//			sum += nums[i];
//		}
//		System.out.println("점수 합계 : " + sum);

		System.out.println(s2.getSum());
		System.out.println(s1.getSum());
		System.out.println(s3.getSum());

	}
}
