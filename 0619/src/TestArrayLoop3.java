public class TestArrayLoop3 {
	public static void main(String[] args) {
		int[] nums = { 13, 26, 21, 2, 4};
		
		// 위 배열 중 짝수를 = > 0으로 변경
		for(int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				nums[i] = 0;
			}
		}		
		// 출력하여 확인
		for (int n : nums) {
			System.out.println(n);
		}
	}
}
