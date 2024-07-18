import java.util.HashMap;
import java.util.Map;

public class Counting {
	public static void main(String[] args) {
		String line = "Hello. I'm developer";
		
		// H 1
		// e 4
		// a 1
		// ...
		
		Map<Character, Integer> count = new HashMap<>();
		for (int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);
			if (count.containsKey(ch)) {
				Integer oldValue = count.get(ch);
				oldValue++;
				count.put(ch, oldValue);
			} else {
				count.put(ch, 1);
			}
		}
		System.out.println(count);
	}
}
