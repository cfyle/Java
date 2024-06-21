// 2. 중복이 없는 정수 6개 랜덤 생성 (1 ~ 45) 하여 크기순으로 출력하기

import java.util.Arrays;
import java.util.Random;

public class Q2 {

	public static void main(String[] args) {
		// 중복이 없는 정수 6개 랜덤 생성 (1 ~ 45) 하며 크기 순서대로 출력하고
		Random r = new Random();
		
		int[] numbers = new int[6];
		int[] copy = Arrays.copyOf(numbers, numbers.length);
		
		int[] reversed = new int[6];
		for (int i = 0; i < numbers.length; i++) {
			copy[i] = r.nextInt(45) + 1;
			System.out.println(copy[i]);
		}
		Arrays.sort(copy);
		System.out.println("==========");
		for (int i = copy.length - 1, j = 0; i >= 0; i--, j++) {
			reversed[j] = copy[i];
		}
		System.out.println(Arrays.toString(reversed));
		
		
	}
}
