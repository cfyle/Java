
public class NumberChecker {
	// 파라미터 정수(int) 하나를 전달받아
	// 0 ~ 100 사이의 수이면 true를 반환하는 메소드
	public boolean isBetweenZeroHundered(int num) {
		if (0 <= num && num <= 100) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		NumberChecker checker = new NumberChecker();
		boolean result = checker.isBetweenZeroHundered(99);
		System.out.println(result);
	}
}
