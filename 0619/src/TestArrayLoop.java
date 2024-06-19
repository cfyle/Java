public class TestArrayLoop {
	public static void main(String[] args) {
		int[] nums = { 10, 20, 30, 40, 50 };
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		// for - each
		int sum = 0;
		for (int n : nums) {
			System.out.println(n);
			sum += n;
		}
		
		System.out.println(sum);
		System.out.println("프로그램 종료");
	}
}
