import java.util.ArrayList;
import java.util.List;

public class TestTargetType {
	public static <T> List<T> createList() {
		return new ArrayList<>();
	}
	
	public static void main(String[] args) {
		List<String> createList = createList();
		createList.add("문자열을 원소");
		
		List<Integer> list = TestTargetType.<Integer>createList();
	}
}
