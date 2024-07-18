import java.util.HashMap;
import java.util.Map;

public class TestMapBusan {
	public static void main(String[] args) {
		// 부산 지도
		// 부산진구 중앙대로 786 - 부전역
		// 부산진구 중앙대로 730 - 서면역
		// 부산진구 가야대로 719 - 부암역
		// 부산진구 전포대로 181 - 전포역
		
		Map<String, String> busanMap = new HashMap<>();
		
		// Key 값이 길고 복잡하면 값을 찾기 힘들다
		busanMap.put("길고복잡한키는 벨류를 찾아가기 위해 동등한 값을 넣어야하는데", "값");
		busanMap.put("부전역", "부산진구 중앙대로 786");
		// ...
	}
}
