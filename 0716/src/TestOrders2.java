import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
	private int score;
	private int height;
	private int weight;

	public Student(int score, int height, int weight) {
		super();
		this.score = score;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Student o) {
		return height - o.height;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "학생 [점수 : " + score + ", 키 : " + height + ", 몸무게 : " + weight + "]";
	}

}

public class TestOrders2 {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();

		students.add(new Student(100, 180, 80));
		students.add(new Student(90, 190, 75));
		students.add(new Student(80, 170, 85));

		Collections.sort(students);

		System.out.println(students);

		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getScore() - o2.getScore();
			}
		});
	}
}
