// 7. 구구단 2 ~ 9 단 모두 출력해보기


public class Q7 {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
	}
}
