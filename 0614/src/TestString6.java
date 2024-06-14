public class TestString6 {
	public static void main(String[] args) {
		String withSpace = "     word word    ";
		System.out.println(withSpace);
		String trim = withSpace.trim();
		
		System.out.println(trim);
		
		String onlySpace = "              ";
		
		System.out.println(onlySpace.trim().length() == 0); // 같은 출력값
		System.out.println(onlySpace.trim().isEmpty());  // 같은 출력값
	}
}
