public class TestArrayParam {
	public int sum(int a, int b) {
		return a + b;
	}
	
	public int sum(int... numbers) { // 가변 길이 파라미터
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
	
	public static void main(String[] args ) {
		TestArrayParam t = new TestArrayParam();
		System.out.println(t.sum(100, 200));
		
		System.out.println(t.sum(300, 400, 500));
		
		System.out.println(t.sum(600, 700, 800, 900));
	}
}
