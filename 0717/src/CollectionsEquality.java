import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class CollectionsEquality {
	public static void main(String[] args) {
		List<Integer> datas = Arrays.asList(200, 300, 100, 400);
		
		ArrayList<Integer> arrayList = new ArrayList<>(datas);
		LinkedList<Integer> linkedList = new LinkedList<>(datas);
		
		System.out.println(arrayList.equals(linkedList));
		System.out.println(arrayList.equals(Arrays.asList(100, 200, 300, 400))); // 원소가 같아도 순서가 다르면 false
		
		HashSet<Integer> hashSet = new HashSet<>(datas);
		System.out.println(arrayList.equals(hashSet)); // linked 와 hashSet 은 항상 다르다
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(datas);
		TreeSet<Integer> treeSet = new TreeSet<>(datas);
		
		System.out.println(hashSet.equals(linkedHashSet));
		System.out.println(hashSet.equals(treeSet));
	}
}
