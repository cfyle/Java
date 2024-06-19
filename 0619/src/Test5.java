public class Test5 {
	public static void main(String[] args) {
		int[] nums = { 33, 37, 48, 52, 77};
		
		// 길이가 5이고, 원소가 nums의 역순인 배열이 필요
		int[] reversed = new int[nums.length];
//		for (int i = 0; i < nums.length; i++) {
//			System.out.println(i + ", " + ((nums.length) - 1));
//		}
		
		for (int i = 0, j = nums.length - 1; i <nums.length; i++, j--) {
			reversed[j] = nums[i];
		}
		
		for (int i = 0; i < reversed.length; i++) {
			System.out.println(reversed[i]);
		}
		
	}
}
