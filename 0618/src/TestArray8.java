public class TestArray8 {
	public static void main(String[] args) {
		char[] arr = {'H', 'e', 'l', 'l', 'o'};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("========================");
		// 문자 e 의 인덱스 번호를 찾아 출력하기
		
		for (int i = 0; i <arr.length; i++) {
			if (arr[i] == 'e') {
			System.out.println("e의 인덱스 : " + i);
			}
		}
	}
}
