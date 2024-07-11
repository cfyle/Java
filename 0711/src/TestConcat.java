public class TestConcat {
	public static void main(String[] args) {
		String a = "A";
		String ref = a;
		
		a += "B";
		
		a += "C";
		
		System.out.println(ref);
		
		System.out.println(a);
	}
}
