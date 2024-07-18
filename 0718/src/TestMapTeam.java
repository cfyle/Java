import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TestMapTeam {
	public static void main(String[] args) {
		// 가장 왼쪽의 구성원이 조장
		// 1조 : 길동, 둘리, 도우너
		// 2조 : 톰, 브레드
		// 3조 : 폴
		// 4조 : 철수, 영희
		
		// 1. 각 조에 몇 명씩 있는지 확인하고자 함
		// 2. 4조의 이름 명단을 확인하고자 함
		// 3. 2조의 이름 명단을 가나다 순으로 확인하고자 함
		// 4. 2조의 조장을 확인하고자 함
		// 5. 3조에 조원 '로우'를 추가하고자 함
		
		// 선언
		Map<Integer, List<String>> map = new HashMap<>();
		map.put(1, Arrays.asList("길동", "둘리", "도우너"));
		map.put(2, Arrays.asList("톰", "브래드"));
		map.put(3, Arrays.asList("폴"));
		map.put(4, Arrays.asList("철수", "영희"));
		
		// 1번
		for (Entry<Integer, List<String>> entry : map.entrySet()) {
			System.out.printf("%d조는 %d명 입니다\n", entry.getKey(), entry.getValue().size());
		}
		
		// 2번
		System.out.println(map.get(4));
		
//		// 3번
//		List<String> list = map.get(2);
//		Collections.sort(list);
//		System.out.println(list);
		
		// 3번, 4번
		List<String> list2 = new ArrayList<>(map.get(2));
		Collections.sort(list2);
		System.out.println(list2);
		
		System.out.println(map.get(2).get(0));
		
		// 5번
		ArrayList<String> newList = new ArrayList<>(map.get(3));
		newList.add("로우");
		map.put(3, newList);
		
		System.out.println(map);
		
	}
}
