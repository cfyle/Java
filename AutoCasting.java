public class AutoCasting {
	public static void main(String[] args) {
		int i = 100;
		long l = i;  // 자동 형변환 (Auto Casting) 
		
		System.out.println(l);
		
		
		long num = 100L;
		float f = num;
		
		//long zero = 0L;
		//int var = zero; // 컴파일 에러 
		
		System.out.println(f);
	}
}