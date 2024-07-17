import java.util.List;
import java.util.Vector;

public class TestVector {
	public static void main(String[] args) {
		List<String> list = new Vector<>();
		
		list.add("문자열");
		list.add("원소");
		list.add("추가");
		
		System.out.println("크기 : " + list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
