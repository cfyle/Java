import java.util.LinkedList;

public class TestLinkedList2 {
	public static void main(String[] args) {
		LinkedList<String> linked = new LinkedList<>();
		
		linked.add("문자열1");
		linked.add("문자열10");
		linked.add("문자열100");
		linked.add("문자열1000");
		
		// 선입선출
		System.out.println(linked.removeFirst());
		System.out.println(linked.removeFirst());
		System.out.println(linked.removeFirst());
		System.out.println(linked.removeFirst());
		
		System.out.println("크기 : " + linked.size());
	}
}
