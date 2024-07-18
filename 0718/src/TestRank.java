// 길동 100
// 둘리 90
// 도우너 95
// 희동 80
// 톰 90
// 브레드 90

// 순위 출력

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class Student {
	public String name;
	public int score;

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public int compareTo(Student o) {

		return this.score - o.score;
	}

	@Override
	public String toString() {
		return "학생 [이름 : " + name + ", 점수 : " + score + "]";
	}

}

public class TestRank {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("길동", 100), new Student("둘리", 90), new Student("도우너", 95),
				new Student("희동", 80), new Student("톰", 90), new Student("브레드", 90));

		Comparator<Student> scoreRank = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.score - o1.score;
			}
		};

		students.sort(scoreRank);

		  // 등수를 저장하기 위한 변수
        int rank = 1;
        // 이전 점수와 현재 점수를 비교하기 위한 변수
        int previousScore = -1;

        // 등수를 매기고 출력
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);

            if (student.score != previousScore) {
                rank = i + 1; // 현재 순위가 등수
            }

            System.out.println("등수: " + rank + ", " + student);
            previousScore = student.score;
        }
    }
}