
public class TestArray {
	public static void main(String[] args) {
		// 배열(Array) : 같은 자료형의 자료를 순서대로 여러개 다룰 수 있는 객체
		int[] arr;
		arr = new int[3];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		for (int index = 0;	index < arr.length; index++) {
			System.out.println(arr[index]);
		}
		
	}
}
