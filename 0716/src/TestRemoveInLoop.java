import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestRemoveInLoop {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "cat", "dog", "Melon"));
		
		// 위 리스트에서 길이가 3인 문자열을 제거하고자 함
		
		Iterator<String> iterator = fruits.iterator();
		while (iterator.hasNext()) {
			String elem = iterator.next();
					if (elem.length() == 3) {
						iterator.remove();
					}
		}
		
		
		
		
//		for (String elem : fruits) {
//			if (elem.length() == 3) {
//				fruits.remove(elem);
//			}
//		} // for each 도 안됨
		
		
//		for (int i = 0; i < fruits.size(); i++) {
//			String elem = fruits.get(i);
//			
//			if (elem.length() == 3) {
//				fruits.remove(i);
//			}
//		} // index 값이 앞으로 땡겨지기 때문에 dog 는 없어지지 않음
		
		System.out.println(fruits);
	}
}
