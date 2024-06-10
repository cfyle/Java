
public class MethodParameter3 {
	// 0부터 전달받은 정수까지의 합을 출력하는 메소드 작성
	
	public static void printSumTo(int lastNum) {
		int sum = 0;
		for (int i = 0; i <= lastNum; i++) {
			sum += i;
		} 
		System.out.println("합 : " + sum);
	}
	
	public static void main(String[] args) {
		// 0 ~ 15 까지의 합 확인
		printSumTo(15);
		
		// 0 ~ 30 까지의 합 확인
		printSumTo(30);
	}
}
