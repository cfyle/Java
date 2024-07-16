public class ThrowingException {
	public void testThrow() {
		throw new RuntimeException("임의의 예외를 발생시켜 봅니다");
	}
	
	
	public static void main(String[] args) {
		ThrowingException t = new ThrowingException();
		
		t.testThrow();
	}
}
