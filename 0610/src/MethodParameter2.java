
public class MethodParameter2 {
	// 0부터 잔달받은 정수값 까지 출력하는 메소드 작성
	public static void printTo(int num) {
		for (int i = 0; i <= num; i++) {
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		printTo(43);
		// 메소드 호출 (77)
		printTo(77);
	}
}
