import java.util.ArrayList;
import java.util.List;

public class TestPersonList2 {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		
		list.add(new Person("길동"));
		list.add(new Person("둘리"));
		list.add(new Person("도우너"));
		list.add(new Person("마이콜"));
		
		// 객체의 동등함을 비교한다. (임의의 클래스인 경우, equals 재정의가 필요)
		list.remove(new Person("길동"));
		
		System.out.println(list.size());
		System.out.println(list.toString());
		
		list.add(new Person("희동"));
		list.add(new Person("희동"));
		
		Person toDelete = new Person("희동");
		
		while (list.contains(toDelete)) {
			list.remove(toDelete);
		}
		
		list.clear(); // 모든 원소 제거
		
		System.out.println("모든 원소 제거 후 : " + list);
		
		
//		list.remove(new Person("희동"));
//		
//		System.out.println(list.toString());
//		
//		boolean contains = list.contains(new Person("희동"));
//		System.out.println("동일 원소가 존재하는지? " + contains); 
	}
}
