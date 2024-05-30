public class Print2 {
	public static void main(String[] args) {
		System.out.println("국어\t영어\t수학");
		System.out.println("100\t80\t70");
		
		System.out.println("국어 \t 영어 \t 수학");
		System.out.println("100 \t 80 \t 70");
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
	}
}