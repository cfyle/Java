class Student extends Human {
	
}

public class Human {
	public static void main(String[] args) {
		Human h = new Human();
		
		Student s = new Student();
		
		
		
		
		Human upcasting = new Student(); // 업캐스팅
		
		Student downcasting = (Student) upcasting;
	}
}

