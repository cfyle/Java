
public class CreateMethod3 {
	// 0 ~ 100 사이의 홀수를 출력하는 메소드 작성
	
	// 0 ~ 100 사이의 짝수를 출력하는 메소드 작성
	
	public static void printOddNumber() {
		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void printEvenNumber() {
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		printEvenNumber();
	}
}
