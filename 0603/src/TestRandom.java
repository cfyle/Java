import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(10); // 0을 포함한 10개의 정수 중 하나를 랜덤으로 생성합니다
		int num2 = r.nextInt(10);
		
		System.out.println(num);
		System.out.println(num2);
	}
}
