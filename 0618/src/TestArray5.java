public class TestArray5 {
	public static void main(String[] args) {
		// 원소로 17, 49, 376, 212, 3을 가지는 배열 생성
		int[] arr = new int[] {17, 49, 376, 212, 3};
		
		System.out.println(arr.length);
		
		int[] arr2 = {17, 49, 376, 212, 3};
		
		System.out.println(arr2.length);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
