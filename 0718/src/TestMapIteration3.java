import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMapIteration3 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		// Map은 Key 에 대한 Set 을 가지고 있다
		// Map은 Key 값만 있으면 value 값을 볼 수 있다
		map.put("D", "디");
		map.put("A", "에이");
		map.put("E", "이");
		map.put("B", "비");
		map.put("C", "씨");
		
		// Key 값으로만 찾기 가능
//		System.out.println(map.get("A"));
//		System.out.println(map.get("에이"));
		
		Collection<String> values = map.values();
		for (String v : values) {
			System.out.println(v);
		}
	}
}
