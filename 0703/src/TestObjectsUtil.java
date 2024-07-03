import java.util.Objects;

public class TestObjectsUtil {
	public static void main(String[] args) {
		String str = "Hello";
		String str2 = "Hello";
		String str3 = null;
		
//		System.out.println(str2.equals(str3));
//		
//		System.out.println(str3.equals(str2));
//		
//		System.out.println(Objects.equals(str2, str3));
		
		System.out.println(Objects.isNull(str3));
		System.out.println(Objects.nonNull(str2));
		
		System.out.println(Objects.toString(str3));
		System.out.println(Objects.toString(str3, "Null일 때, 기본 문자열값"));
		
	}
}
