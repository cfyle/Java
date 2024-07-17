import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		
//		queue.add("문자열1");
//		queue.add("문자열10");
//		queue.add("문자열100");
//		queue.add("문자열1000");
		
		queue.offer("문자열1");
		queue.offer("문자열10");
		queue.offer("문자열100");
		queue.offer("문자열1000");
		
		System.out.println(queue.size());
		
		// poll 은 원소가 없는 경우 값으로 알려줌 (null)
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		System.out.println(queue.poll());
		
		// remove 는 예외를 던짐
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());
//		
//		System.out.println(queue.remove());
	}
}
