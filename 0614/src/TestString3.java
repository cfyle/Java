import javax.xml.soap.Text;

public class TestString3 {
	public static void main(String[] args) {
		String word = "word";
		System.out.println(word.length());
		
		System.out.println(word.charAt(0));
		
		// 문자열 메소드 중, 시작 문자열 일치를 확인할 수 있는 메소드를 검색해보세요
		boolean result = word.startsWith("w");
		System.out.println(result);
	}
}
