import java.util.List;
import java.util.ArrayList;

public class TestDoubleList {
	public static void main(String[] args) {
		List<Double> list = new ArrayList<>();
		
		list.add(50.55);
		
		System.out.println(list.size());
		
		list.add(30.21);
		list.add(1.1);
		list.add(40.44);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}
}
