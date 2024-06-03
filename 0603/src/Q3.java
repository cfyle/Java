// 주사위 던지기 게임
// - 1~6 사이의 눈을 가지는 주사위를 2번 던져
// - 같은 수가 나오면 '페어' 라고 출력하는 프로그램
// 둘 다 페어가 나오면 눈금이 큰사람
// 눈이 같으면 비겼다

import java.util.Random;

public class Q3 {

	public static void main(String[] args) {
		Random r = new Random();
		
		System.out.println("A님의 주사위를 입력(던져) 하세요");
		
		int num1 = r.nextInt(6) + 1;
		System.out.print(num1 + ", " );
		int num2 = r.nextInt(6) + 1;
		System.out.println(num2);

		int sum1 = num1 + num2;
		
		if (num1 == num2) {
			System.out.println("페어");
			System.out.println("눈금의 합은 : " + sum1);
		} else {
			System.out.println("눈금의 합은 : " + sum1);
		}
		
		System.out.println("------------------------");
		
		System.out.println("B님의 주사위를 입력(던져) 하세요");
		
		int num3 = r.nextInt(6) + 1;
		System.out.print(num3 + ", ");
		int num4 = r.nextInt(6) + 1;
		System.out.println(num4);
		int sum2 = num3 + num4;
		
		if (num3 == num4) {
			System.out.println("페어");
			System.out.println("눈금의 합은 : " + sum2);
		} else {
			System.out.println("눈금의 합은 : " + sum2);
		}
		
		System.out.println("-------------------------");
		
		if (sum1 > sum2) {
			System.out.println("A가 이겼습니다");
		} else if (sum1 == sum2) {
			System.out.println("둘이 비겼습니다");
		} else {
			System.out.println("B가 이겼습니다.");
		}
	}

}
