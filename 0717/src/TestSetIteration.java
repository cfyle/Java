import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetIteration {
	public static void main(String[] args) {
		// set 은 중복에 관심
		// HashSet 은 순서를 보장하지 않음
		Set<String> set = new HashSet<>();
		set.add("원소1");
		set.add("원소2");
		set.add("원소3");
		set.add("원소4");
		set.add("원소5");
		
		System.out.println(set.contains("원소1"));
		System.out.println(set.contains("원소4"));
		
		for (String s : set) {
			System.out.println(s);
		}
		
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
