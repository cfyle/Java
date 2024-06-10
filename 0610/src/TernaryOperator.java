
public class TernaryOperator {
	public static void main(String[] args) {
		// ? 삼항연산자
		
		System.out.println(false ? "참" : "거짓");
		
		int num = 4;
		System.out.println(num % 2 == 0 ? "짝수" : "홀수");
		
		int num2 = 12;
		String result = (num2 % 3 == 0) ? "3의 배수" : "3의 배수가 아님";
		System.out.println(result);
		
		
	}
}
