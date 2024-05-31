// 사용자의 3대 운동 중량을 압력받아
// 총 합이 500이상이면 true
// 미만인 경우는 false를 출력하는 프로그램

import java.util.Scanner;

public class UnderArmour {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("벤치프레스, 데드리프트, 스쿼트 중량을 입력하세요");
		
		int bench = scanner.nextInt();
		int dead = scanner.nextInt();
		int squart = scanner.nextInt();
		
		System.out.println(bench + dead + squart >= 500);
	}
}