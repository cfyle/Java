import java.util.Arrays;

public class TestArraysUtil3 {
	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5 };
		int[] anotherRef = original;
		
		
		int[] copy = Arrays.copyOf(original, original.length);
		
		// 참조 값이 같음
		System.out.println(original == anotherRef);
		
		// 동한 모양의 새로운 인스턴스 생성, 새로운 참조
		System.out.println(original == copy);
		
		//동일한지 확인(값이 동일한지)
		System.out.println(Arrays.equals(original, anotherRef));
		System.out.println(Arrays.equals(original, copy));
		
	}
}
