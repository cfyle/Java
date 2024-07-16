import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<String> listStr = new ArrayList<>(); // <String> String 객체만 추가하겠다? // 오른쪽 <String> 은 <> 로 생략 가능
		
		listStr.add("문자열");
//		listStr.add(10); // 컴파일 에러
		
		String elem = listStr.get(0);
	}
}
