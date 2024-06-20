import java.util.Arrays;

public class TestRefArray {
	public static void main(String[] args) {
		String a = "a";
		String b = "b";
		String c = "c";
		String d = "d";
		
		String[] arr = new String[4];
		
		arr[0] = "a";
		arr[1] = "b";
		arr[2] = "c";
		arr[3] = "d";
		
		// 배열 내용 확인 방법
		System.out.println(Arrays.toString(arr));
		
		System.out.println("==========");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("==========");
		
		for (String s : arr) {
			System.out.println(s);
		}
	}
}
