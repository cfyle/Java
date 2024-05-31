public class LogicalOperator {
	public static void main(String[] args) {
		
		// And 연산자 (&&)
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("--------");
		
		
		// Or 연산자 (||)
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("--------");
		
		
		// Not 연산자 (!)
		System.out.println(!true);
		System.out.println(!false);
	}
}