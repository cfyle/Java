
public class TestArray7 {
	public static void main(String[] args) {
		// 원소가 60, 70, 80 인 int 형 배열 선언 및 초기화
		
		int arr[] = {60, 70, 80};
		
//		long[] arr2 = (long[]) arr;  // 컴파일 에러
		
		// arr과 배열이 같은 원소를 가지는 long 배열은?
		
		long[] arr2 = new long[3];
		
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		System.out.println(arr2[1]);
		
		
		
	}
}
