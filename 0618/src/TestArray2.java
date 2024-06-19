
public class TestArray2 {
	public static void main(String[] args) {
		int[] arr = new int[3];  // int 형 배열을 선언하게 되면 기본 정수형은 0을 출력
		
		System.out.println("길이값 : " + arr.length);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		// 요스 (element)
		// 각 인덱스에 2의 배수를 대입 연산, 모두 접근해서 출력
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 6;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}
