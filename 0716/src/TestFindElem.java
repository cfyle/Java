import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestFindElem {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("원소1", "원소2", "원소3", "원소4", "원소4", "원소4", "원소5"));
		
		// "원소4" 의 index를 찾아 출력하기
		for (int i = 0; i < list.size(); i++) {
			String elem = list.get(i);
			if (elem.equals("원소4")) {
				System.out.println("인덱스 : " + i);
			}
		}
		
		int find = list.indexOf("원소4");
		System.out.println("인덱스 : " + find);
		
		System.out.println(list.lastIndexOf("원소4"));
		
		System.out.println(list.indexOf("없는 원소"));
	}
}
