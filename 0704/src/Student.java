import java.util.Comparator;
import java.util.Objects;


class ScoreComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getScore() - o2.getScore();
	}
	
}

class Ruler implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getHeight() - o2.getHeight();
	}
	
}

// <> 제네릭
public class Student implements Comparable<Student> {
	private int height;
	private int weight;
	private int score;
	
	


	public Student(int height, int weight, int score) {
		super();
		this.height = height;
		this.weight = weight;
		this.score = score;
	}

	@Override
	public int compareTo(Student o) {
		return this.weight - o.weight; 
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [height=" + height + ", weight=" + weight + ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(height, score, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		return height == other.height && score == other.score && weight == other.weight;
	}

}
