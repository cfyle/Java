
public class NumberTest {
	public static void main(String[] args) {
		NumberGenerator g = new NumberGenerator();
		int result = g.generateOne();
		System.out.println("반환값 확인: " + result);
		
		System.out.println("프로그램 종료");
	}
}
