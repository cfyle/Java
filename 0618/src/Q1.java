import java.util.Scanner;

// 1. 총 3개의 정수를 입력받아, 합 & 평균을 출력하는 프로그램 

public class Q1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int[] numbers = { a, b, c };
		
		int sum = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}

		
		int avg = sum / numbers.length;
		
		
		System.out.println("3개의 정수의 합은 : " + sum);
		System.out.println("3개의 정수의 평균은 : " + avg);
	}
}