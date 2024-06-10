import java.util.Random;
import java.util.Scanner;

public class Q2 {
//	
//	public static void enemyScore() {
//		Random r = new Random();
//		int enemy = r.nextInt(10);
//		System.out.println(enemy);
//	}

	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		System.out.println("숫자 세자리를 입력하세요");
		int i = s.nextInt();
		int j = s.nextInt();
		int k = s.nextInt();
		
		int c1 = r.nextInt(10);
		int c2 = r.nextInt(10);
		int c3 = r.nextInt(10);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		
		for (i = 0; i <= 9; i++) {
			for (j = 0; j <= 9; j++) {
				for (k = 0; k <= 9; k++) {
					if (c1 == i) {
						System.out.println("스트라이크");
					} else if (c1 == j) {
						System.out.println("볼");
					} else if (c1 == k) {
						System.out.println("볼");
					} else {
						System.out.println("");
					}
					
					if (c2 == j) {
						System.out.println("스트라이크");
					} else if (c2 == i) {
						System.out.println("볼");
					} else if (c2 == k) {
						System.out.println("볼");
					} else {
						System.out.println("");
					}
					
					if (c3 == k) {
						System.out.println("스트라이크");
					} else if (c3 == i) {
						System.out.println("볼");
					} else if (c3 == j) {
						System.out.println("볼");
					} else {
						System.out.println("");
					}
					
					
				}
			}
				
			
		}
		
	
		
		
	}
}
