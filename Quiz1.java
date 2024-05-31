// 1. 사용자의 체중(정수 kg 단위)을 입력받아
// 일일 권장 단백질 섭취량을 계산해 출력하는 프로그램
// (일일 권장 단백질은 1kg 당 0.8 ~ 1.5g 입니다.)

// 입력예) 72 => 출력예) 57.6 ~ 108.0 gram

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("사용자의 체중은?");
		double weight = s.nextDouble();
		
		System.out.println("사용자의 권장 단백질 섭취량은 " + (weight * 0.8) + "g ~ " + (weight * 1.5) + "g 입니다.");
		
		
	}
}