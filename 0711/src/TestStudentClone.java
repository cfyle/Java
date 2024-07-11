public class TestStudentClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		Pen p = new Pen(10000);
		
		Student s = new Student(100, p);
		
		Student copy = (Student) s.clone();
		
		p.setPrice(500);
		
		System.out.println(copy.toString());
	}
}
