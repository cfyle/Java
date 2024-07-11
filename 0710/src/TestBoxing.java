public class TestBoxing {
	public static void main(String[] args) {
		int num = 22;
		
		// Boxing
		Integer wrapped = new Integer(num);
		Integer another = Integer.valueOf(num);
		// Auto-Boxing
		Integer auto = num;
		
		System.out.println(auto);
		
		// Unboxing
		int unwrapped = wrapped.intValue();
		
		// Auto-Boxing
		int autoUnboxing = auto;
		
		System.out.println(autoUnboxing);
	}
}
