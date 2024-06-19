import java.util.Scanner;

// 2. 총 3개의 정수를 입력받아, 마지막 입력(최근입력)의 점수를 출력하는 프로그램

public class Q2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		int last = arr.length;
		
		System.out.println(arr[last - 1] );
	}
}
