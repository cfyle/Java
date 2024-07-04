import java.util.Arrays;

public class TestStudent {
	public static void main(String[] args) {
		Student[] arr = new Student[] {
				new Student(180, 80, 100), 
				new Student(170, 70, 90), 
				new Student(190, 75, 95)
		};
		
		
		System.out.println(arr[0].compareTo(arr[1]));
		System.out.println(arr[0].compareTo(arr[2]));
		
		Arrays.sort(arr);
		System.out.println("--몸무게순--");
		for (Student s : arr) {
			System.out.println(s);
		}
		
		System.out.println("-- Ruler(Comprator) 사용한 키 순 --");
		Arrays.sort(arr, new Ruler());
		for (Student s : arr) {
			System.out.println(s);
		}
		
		System.out.println("-- 점수 순 --");
		Arrays.sort(arr, new ScoreComparator());
		for (Student s : arr) {
			System.out.println(s);
		}
	}
}
