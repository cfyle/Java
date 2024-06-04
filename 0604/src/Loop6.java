import java.util.Scanner;

public class Loop6 {
	public static void main(String[] args) {
		// 사용자가 정수 2개를 입력하면
		// 범위 안의 정수를 출력하는 프로그램
		
		// 예) 20 30 => 21, 22, 23, 24 ... 29
		// 예) 40 35 => 39, 38, 37, 36
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 두개 입력하세요");
		int left = scanner.nextInt();
		int right = scanner.nextInt();
		
		
		System.out.println("두 정수 사이의 값은");
		
//		while (left < right) {
//			left++;
//			System.out.println(left);
//			left++;
//		} 
//		
//		
//		while (left > right) {
//			right++;		
//			System.out.println(right);
//			right++;
//		}
		
		
		if (left < right) {
			left++;
			while (left < right) {
				System.out.println(left);
				left++;
			}
		} else {
			left--;
			while (left > right) {
				System.out.println(left);
				left--;
			}
		}		
	}
}
