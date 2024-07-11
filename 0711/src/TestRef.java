public class TestRef {
	public static void main(String[] args) {
		String abc = "ABC";
		String ref = "ABC";
		
		System.out.println(abc == ref);
		
		String instance = new String("ABC");
		
		System.out.println(abc == instance);
	}
}
