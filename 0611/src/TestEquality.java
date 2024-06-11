public class TestEquality {
	public static void main(String[] args) {
		String hello = "HELLO";
		
		String he = "HE";
		String llo = "LLO";
		
		String concat = he + llo;
		
		System.out.println(concat);
		System.out.println(concat == hello); // 값은 같아도 다른 객체
		boolean result = concat.equals(hello);
		System.out.println(result);
	}
}
