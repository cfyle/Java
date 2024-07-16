import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestOrders {
	public static void main(String[] args) {

		List<Integer> number = new ArrayList<>();

		number.add(100);
		number.add(50);
		number.add(1);
		number.add(13);
		number.add(7);
		
		System.out.println(number);
		
		// 정렬 (natural order)
		Collections.sort(number);
		
		System.out.println(number);
		
		// 역순 정렬
		Collections.sort(number, Collections.reverseOrder());
		
		System.out.println(number);
		
		// 셔플
		Collections.shuffle(number);
		System.out.println(number);
	}

}
