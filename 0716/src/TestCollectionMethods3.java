import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCollectionMethods3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "c", "d", "e"));

		List<String> subList = new ArrayList<>(Arrays.asList("a", "b", "z"));
		
		boolean containsAll = list.containsAll(subList); // 모든 원소가 있을때 true / 하나라도 없으면 false
		System.out.println(containsAll);
		
		list.retainAll(subList);
		
		System.out.println(list);
		
	}
}
