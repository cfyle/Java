public class Sum1 {
	public static void main(String[] args) {
		// 1부터 10까지의 합을 구해 출력하기
//		int i = 1;
//		int sum = 0;
//		while (i <= 10) {
//			sum = sum + i;
//			i++;
//		}
//		System.out.println(sum);
		
		// 10 이상 100 미만의 정수 중 
		// 홀수만의 합을 구해보세요.
		
		int i = 10;
		int sum = 0;
		while (10 <= i && i < 100) {
			if (i % 2 == 1) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println(sum);
	}
}
