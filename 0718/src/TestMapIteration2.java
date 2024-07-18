import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMapIteration2 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		// Map은 Key 에 대한 Set 을 가지고 있다
		// Map은 Key 값만 있으면 value 값을 볼 수 있다
		map.put("D", "디");
		map.put("A", "에이");
		map.put("E", "이");
		map.put("B", "비");
		map.put("C", "씨");
		
		
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
		
		Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
	
	}
}
