
public class ForLoop3 {
	public static void main(String[] args) {
		// 0 ~ 10 까지의 합을 출력하기
		
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// 70 ~ 800 사이의 정수 중 짝수의 개수
		
		int count = 0;
		for (int a = 70; a <= 800; a++) {
			if (a % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
