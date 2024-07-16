import java.util.ArrayList;
import java.util.List;

public class TestPersonList3 {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		
		list.add(new Person("길동"));
		list.add(new Person("둘리"));
		list.add(new Person("도우너"));
		list.add(new Person("마이콜"));
		
		list.add(0, new Person("희동"));
		
		System.out.println(list.toString());
		
		list.add(2, new Person("톰"));
		
		System.out.println(list.toString());
		System.out.println("원소 제거 전 크기 : " + list.size());
		
		list.remove(0);
		System.out.println("원소 제거 후 크기 : " + list.size());
		System.out.println(list.toString());
	}
}
