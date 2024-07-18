import java.util.HashMap;
import java.util.Map;

public class TestMap2 {
	public static void main(String[] args) {
		Map<Integer, String> students = new HashMap<>();
		
		//           학번 ,  "이름"
		students.put(1001, "길동");
		students.put(1002, "둘리");
		students.put(1003, "도우너");
		students.put(1004, "길동");
		
		// Key 값을 입력 하면 Value 값을 반환
		System.out.println(students.get(1003));
		
		// 해당하는 키 값이 있는지 boolean 으로 확인
		System.out.println(students.containsKey(1005));
		
		// 없는 값을 달라고 하면 null 반환
		System.out.println(students.get(1005));
	}
}
