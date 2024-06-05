// 1 ~ 45 사이의 무작위 정수 6개를 출력하는 프로그램

import java.util.Random;

public class ForLoop6 {
	public static void main(String[] args) {
		Random r = new Random();
		
		for (int i = 1; i <= 6; i++) {
			int num = r.nextInt(45) + 1;
			System.out.println(num);
		}
	}
}
