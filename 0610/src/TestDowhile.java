
public class TestDowhile {
	public static void main(String[] args) {
		boolean go = false;
		while (go) {
			System.out.print("실행되지 않는 문장");
		}
		
		do {
			System.out.println("한번은 실행되는 문장");
		} while (go);
	}
}
