import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMapIteration {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		// Map은 Key 에 대한 Set 을 가지고 있다
		// Map은 Key 값만 있으면 value 값을 볼 수 있다
		map.put("D", "디");
		map.put("A", "에이");
		map.put("E", "이");
		map.put("B", "비");
		map.put("C", "씨");
		
		Set<String> keySet = map.keySet();
		
		for (String key : keySet) {
			String value = map.get(key);
			
			System.out.printf("키 : %s, 벨류 : %s\n", key, value);
		}
		
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			String value = map.get(key);
			
			System.out.printf("키 : %s, 벨류: %s\n", key, value);
		}
	}
}
