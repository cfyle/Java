import java.util.Scanner;

// 3. 총 3개의 정수를 입력받아, 합 & 평균, 입력된 정수를 입력된 순서로 출력하는 프로그램

public class Q3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] numbers = new int[3];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextInt();
		}
		
		int sum = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}

		System.out.println(sum);
		int avg = sum / numbers.length;
		System.out.println(avg);
		
		System.out.println(numbers[numbers.length - 1]);
	}
}
