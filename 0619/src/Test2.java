public class Test2 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30};
		
		// 위의 배열이 길이가 부족해, 길이가 5인 배열을 생성하고자 함
		// 이 때, 기존의 원소는 그대로 존재해야함
		int[] extend = new int[5];
		for(int i = 0; i < arr.length; i++) {
			extend[i] = arr[i];
		}
		
		for (int i = 0; i < extend.length; i++) {
			System.out.println(extend[i]);
		}
		
		
		System.out.println("프로그램 종료");
	}
}
