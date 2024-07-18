import java.util.HashMap;
import java.util.Map;

public class TestMapOperation {
	public static void main(String[] args) {
Map<String, String> map = new HashMap<>();

		map.put("D", "디");
		map.put("A", "에이");
		map.put("E", "이");
		map.put("B", "비");
		map.put("C", "씨");
		
		// 쌉가능
		map.put(null, "널도 키가 되나요?");
		
		// Key 값으로 삭제 가능 
		map.remove("A");
		System.out.println(map);
		
		// Value 는 삭제가 되지 않는다
		map.remove("비");
		System.out.println(map);
		
		// Key와 Value 값이 모두 맞아야 삭제
		map.remove("B", "비");
		System.out.println(map);
		
		// Value 값이 틀리면 삭제 불가능
		map.remove("C", "잘못입력한 값");
		System.out.println(map);
		
		// 변경
		String replace = map.replace("D" , "알파뱃 디");
		System.out.println("변경 이전의 값 : " + replace);
		System.out.println(map);
		
		// Key 를 집어 넣어서 Value 값을 변경
		map.replace("D", "알파뱃 디");
		System.out.println(map);
	}
}
