public class TestStaticMethods2 {
	public static void main(String[] args) {
		String formatted = String.format("%02d:%02d:%02d", 10, 5, 2);
		System.out.println(formatted);
		
		String join = String.join(",",  "여러개", "문자열", "나열을", "합니다");
		System.out.println(join);
	}
}
