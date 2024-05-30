// 5. 구의 반지름(정수)을 입력받아, 구의 부피를 구하는 프로그램
/*
	구의 부피 공식은 다음과 같습니다.
	4 / 3 x 반지름의 3제곱 x 파이(3.14)
*/

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("반지름을 입력하세요");
		float r = s.nextInt();
		
		
		
		System.out.printf("구의 부피는 : %.2f", + (4 / 3) * (r * r * r) * 3.14);
		
		
	}
}