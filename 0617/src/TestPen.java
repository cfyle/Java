public class TestPen {
	public static void main(String[] args) {
		Pen pen = new Pen("모나미", 1000);
		pen.write("일기");
		pen.write("메모");
		
		Student student = new Student("판호", 100, pen);
		student.writeName();
	}
}
