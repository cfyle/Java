public class TestStringStaticMethods {
	public static void main(String[] args) {
		// static method ( 정적 메소드) 호출
		
		double mola = Math.pow(2.0, 4.0);
		System.out.println(mola);
		String result = String.valueOf(100);
		System.out.println(result);
		System.out.println(result + result);
		
		String textNum1 = "3040";
		String textNum2 = "1234";
		
		System.out.println(textNum1 + textNum2);
		
		int num1 = Integer.parseInt(textNum1);
		int num2 = Integer.parseInt(textNum1);
		
		System.out.println(num1 + num2);
		
		int num3 = Integer.valueOf("8787");
		System.out.println(num3 + 1);
		
//		Integer.parseInt("3#2%ab%3332");
		System.out.println("프로그램 정상 종료");
					
	}
}
