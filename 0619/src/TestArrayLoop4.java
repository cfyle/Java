public class TestArrayLoop4 {
	public static void main(String[] args) {
		int[] nums = { 0, 32, 12, 55, 35};
		
		for (int i = 0; i < nums.length; i += 2) {
			System.out.println(nums[i]);
		}
		
		int count = 0;
		for (int n : nums) {
			count++;
			if (count % 2 == 0) {
				continue;
			}
			System.out.println(n);
		}
		
	}
}
