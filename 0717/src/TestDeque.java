import java.util.Deque;
import java.util.LinkedList;

public class TestDeque {
	public static void main(String[] args) {
		// Deque : 양방향 queue
		// 후입선출 - stack
		Deque<String> deque = new LinkedList<>();
		
		deque.offer("문자열1");
		deque.offer("문자열10");
		deque.offer("문자열100");
		deque.offer("문자열1000");
		
		// 최근것 부터 꺼냄
		System.out.println(deque.pollLast());
		System.out.println(deque.pollLast());
		System.out.println(deque.pollLast());
		System.out.println(deque.pollLast());
	}
}
