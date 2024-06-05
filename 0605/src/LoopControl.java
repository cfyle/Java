
public class LoopControl {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			if (i == 30) {
				break;
			}
//			System.out.println("문장");  // 컴파일 오류
		}
		System.out.println("프로그램 종료");
	}
}
