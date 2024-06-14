
public class TestString {
	public static void main(String[] args) {
		String str = "문자열";
		String anotherRef = str;
		
		anotherRef += "문자열";
		
		System.out.println(anotherRef);
		System.out.println(str);
	}
}
