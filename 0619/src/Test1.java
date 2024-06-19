public class Test1 {
	public int[] createZeroToNum(int lastNum) {
		int[] arr = new int[lastNum + 1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Test1 t = new Test1();
		// 정수 원소 0 ~ 10 을 가지는 배열 선언 및 초기화
		int[] result = t.createZeroToNum(10);
		
		// 정수 원소 0 ~ 15 을 가지는 배열 선언 및 초기화
		int[] result2 = t.createZeroToNum(15);
		
		// 정수 원소 0 ~ 20을 가지는 배열 선언 및 초기화
		int[] result3 = t.createZeroToNum(20);
		
		for (int i = 0; i < result3.length; i++) {
			System.out.println(result3[i]);
		}
	}
}
