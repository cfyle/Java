import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestTreeHeadTail {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50));
		
		Map<Integer, String> map = new TreeMap<>();
		map.put(10, "십");
		map.put(20, "이십");
		map.put(30, "삼십");
		map.put(40, "사십");
		map.put(50, "오십");
		
		// 30 기준으로 앞쪽 
		SortedSet<Integer> headSet = set.headSet(30);
		System.out.println(headSet);
		
		// 30 포함 뒷쪽
		SortedSet<Integer> tailSet = set.tailSet(30);
		System.out.println(tailSet);
		
		headSet.add(15);
		
		System.out.println(set);
		
		tailSet.add(35);
		
		System.out.println(set);
		
//		SortedMap<Integer, String> headMap = map.headMap(30);
//		System.out.println(headMap);
//		headMpa.put(15, "십오");
//		System.out.println(map);
	}
}
