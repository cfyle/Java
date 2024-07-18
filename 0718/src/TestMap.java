import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		// Map 은 왼쪽에 있는 값이 기준이 된다. 
		// (key, value) - key 값은 중복을 허용하지 않는다
		// key 값이 중복이 되면 최근 값으로 덮어 쓴다
		
		// key 와 value 를 entry 라고 부른다
		map.put("사과", "는 맛있어");
		map.put("바나나", "는 길어");
		map.put("기차", "도 길어");
		
		System.out.println(map.size());
		
		map.put("사과", "잘못을 인정하고 용서를 빎");
		
		System.out.println(map.size());
		
		map.put("자", "도 길어"); // Value 의 중복은 따지지 않는다
		
		System.out.println(map.size());
		
		System.out.println(map.toString());
	}
}
