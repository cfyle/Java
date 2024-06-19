public class TestArrayLoop5 {
	public static void main(String[] args) {
		int[] nums = { 10, 20, 30, 40, 50, 60};
		
		// 위 배열의 10의 자리 수가 홀수인 원소를 출력
//		for (int i = 0; i < nums.length; i++) {
//			
//		}
		
		for (int n : nums) {
			int ten = n / 10;
			if (ten % 2 == 1) {
				System.out.println(n);
			}
		}
	}
}
