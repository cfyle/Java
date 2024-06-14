
public class NameChecker {
	// 전달된 파라미터 문자열이 null 이거나,
	// 공백을 포함하거나
	// 빈문자열이거나
	// 길이값이 10을 초과할 때 false 를 리턴하는 메소드
	public boolean check(String name) {
		if (name.contains(" ")) {
			return false;
		}
		
		if (name.isEmpty()) {
			return false;
		}
		
		if (name.length() > 10) {
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		NameChecker checker = new NameChecker();
		System.out.println(checker.check(" "));
		
		System.out.println(checker.check(""));
		
		System.out.println(checker.check("12345678901234"));
		
		System.out.println(checker.check("Bread"));
		
		System.out.println(checker.check(null));
	}
}
