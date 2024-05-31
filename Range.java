// 사용자 입력한 정수
// 0이상 100이하의 수라면 true
// 범위 밖의 수라면 false

import java.util.Scanner;

public class Range{
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("정수를 하나 입력하세요");
	
		int num = scanner.nextInt();
	
		System.out.println(0 <= num && num <= 100);
	}
}