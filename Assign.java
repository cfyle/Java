public class Assign {
	public static void main(String[] args) {
		int num = 0;
		
		num = 80;
		
		num = num + 10;
		
		System.out.println(num);
		
		// num = num + 10;
		num += 10; // 복합 대입 연산자 
		
		System.out.println(num);
		
		// num = num - 50;
		num -= 50;
		
		System.out.println(num);
		
		// num = num * 3;
		num *= 3;
		
		System.out.println(num);
		
		// num = num / 3;
		num /= 3;
		
		System.out.println(num);
		
		// num = num % 2;
		num %= 2;
		
		System.out.println(num);
	}
}