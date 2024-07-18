import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {
		// 숫자가 낮은 것이 왼쪽
		Map<Integer, String> map = new TreeMap<>();
		
		map.put(50, "가");
		map.put(25, "나");
		map.put(75, "다");
		
		System.out.println(map);
		
		// Key 값이 중복이면 x
		map.put(50, "라");
		System.out.println(map);
	}
}
