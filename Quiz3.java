// 단위 환산 프로그램
// 키를 cm 단위(정수)로 입력받아
// ft, inch 형태로 출력하기 (1ft = 12inch, 1inch = 2.54cm)

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("키를 입력하세요.");
		float height = s.nextInt(); 
		float inch = height / 2.54f;
		float ft = inch / 12f;
		
		System.out.printf("당신의 키는 : %.2f cm \n", height);
		System.out.printf("당신의 키는 : %.2f inch \n", inch);
		System.out.printf("당신의 키는 : %.2f ft \n", ft);
	}
}