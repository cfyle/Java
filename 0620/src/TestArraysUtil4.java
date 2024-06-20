import java.util.Arrays;

public class TestArraysUtil4 {
	public static void main(String[] args) {
		int[] origin = { 1, 2 , 3 };
		
		// 길이값 늘리기 가능 (원본길이값 3에서 10까지 늘림)
		int[] copy = Arrays.copyOf(origin, 10);
		
		System.out.println(copy.length);
		
		System.out.println(Arrays.toString(copy));
		
		// 길이값 줄이기 가능
		int[] shorten = Arrays.copyOf(origin, 1);
		System.out.println(Arrays.toString(shorten));
	}
}
