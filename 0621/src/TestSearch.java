import java.util.Arrays;
import java.util.Random;

public class TestSearch {
	public static void main(String[] args) {
		Random r = new Random();
		
		int[] numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(30);

		}
		
		// 해당 배열에 정수 15가 있는지, 있다면 index는?
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 15) {
				System.out.println("15 두두둥장!");
				System.out.println("정수 15의 인덱스 : " + i);
			}
		}
		System.out.println(Arrays.toString(numbers));
		
	}
}
