import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("원소1");
		boolean dup = set.add("원소1");
		System.out.println(dup);
		set.add("원소1");
		
		set.add("원소1");
		set.add("원소1");
		
		set.add("100");
		set.add("ABC");
		
		System.out.println(set.size());
		
		System.out.println(set.toString());
	}
}
