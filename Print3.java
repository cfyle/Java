public class Print3 {
	public static void main(String[] args) { 
		System.out.printf("일반적인");
		System.out.printf("문자열 출력");
		System.out.println();
		System.out.printf("정수값 %d 하나 출력\n", 100);
		System.out.printf("정수값 %d, %d 출력\n", 200, 300);
		
		// System.out.printf("%d %d %d", 400); 
		
		// System.out.printf("%f\n", 3.5); // 실수를 표현하려면 %f
		System.out.printf("%.2f\n", 3.5); // .2 소수점 자리
		
		System.out.printf("%s\n", "문자열은 s");
		System.out.printf("%b\n", true);
		
		System.out.println("정상적인 프로그램 종료");
	}
}