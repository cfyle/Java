import java.util.Arrays;

public class TestArraysUtil1 {
	public void print(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

	public String elemString(int[] num) {
		String str = "";
		for (int i = 0; i < num.length; i++) {
			str += num[i] + " ";
		}
		return str;
	}

	public static void main(String[] args) {
		int[] num = { 10, 20, 30 };		
		
//		TestArrayUtil1 util = new TestArrayUtil1();
//		util.print(num);
//
//		String str = util.elemString(num);
//		System.out.println(str);
		
		
		
		// toString을 사용하면 쉽게 바꿀 수 있다
		String result = Arrays.toString(num);
		System.out.println(result);
	}
}