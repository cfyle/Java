import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
	public static void main(String[] args) {
		// Linked List - 중간 원소의 추가/삭제가 빈번한 경우 사용
		// 일반적인 순환 작업은 느림
		List<String> list = new LinkedList<>();
		
		list.add("문자열");
		list.add("원소");
		list.add("추가");
		
		System.out.println("크기 : " + list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
