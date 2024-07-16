public class TryFinally {
	public static void main(String[] args) {
		System.out.println("문장1");
		
		try {
			System.out.println("문장2");
			System.out.println("문장3");
			
			int result = 10 / 0;
			
			System.out.println("문장4");
		} catch (Exception e) {
			System.out.println("예외 처리");
		} finally {
			System.out.println("언제나 실행 됩니다");
		}
		
		System.out.println("문장 마지막");
	}
}
