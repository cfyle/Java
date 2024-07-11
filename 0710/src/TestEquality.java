public class TestEquality {
	public static void main(String[] args) {
		Integer a = new Integer(10);
		Integer b = new Integer(10);
		
		int i = 10;
		int j = 10;
		
		System.out.println(a == b);
		
		System.out.println(a.equals(b));
		
		System.out.println(a == i);
		System.out.println(i == a);
		
		System.out.println(a.equals(i));
		
		Integer num = Integer.valueOf(22);
		Integer num2 = Integer.valueOf(22);
		
		System.out.println(num.equals(num2));
		System.out.println(num == num2);
		
		Short sh = 22;
		Long l = 22L;
		
		System.out.println(num.equals(sh));
		System.out.println(num.equals(l));
		
	}
}
