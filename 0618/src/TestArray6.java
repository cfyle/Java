
public class TestArray6 {
	public static void main(String[] args) {
		// long 타입의 길이가 5인 배열 선언 및 초기화
		long[] arr = new long[5];
		
		// 10, 20, 30, 40, 50
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 10;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
