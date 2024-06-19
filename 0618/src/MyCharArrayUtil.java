
public class MyCharArrayUtil {
	public void printElems(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	// 문자 배열과, 특정 문자 하나를 전달받아
	// 해당 하는 문자의 인덱스를 반환하는 메소드
	public int find(char[] arr, char ch) {
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				return i;
			}
		}
		return -1;
	}
	
	// 문자 배열과, 특정 문자 하나를 전달받아
	// 동일한 문자가 존재하면 true, 없는 경우 false 를 반환하는 메소드
	public boolean exist(char[] arr, char ch) {
		int index = find(arr, ch);
		return index >= 0;
	}
	
}
