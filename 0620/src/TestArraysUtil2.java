import java.util.Arrays;

public class TestArraysUtil2 {
	public static void main(String[] args) {
		int[] fillTen = new int[5];
		
		// fill 메소드를 사용하면 쉽게 내용을 채울 수 있다
		
		// 모든 배열을 10으로 바꾸기
		Arrays.fill(fillTen, 10);
		System.out.println(Arrays.toString(fillTen));
		
		//         (배열의 , 부터, 까지, 15); 로 바꾸기
		Arrays.fill(fillTen, 0, 2, 15);
		System.out.println(Arrays.toString(fillTen));
		
		int[] copy = Arrays.copyOf(fillTen, fillTen.length);
		System.out.println();
	}
}
