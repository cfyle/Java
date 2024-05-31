public class LogicalOperator2 {
	public static void main(String[] args) {
		
		// 참 && 참 && 거짓 ?
		System.out.println(true && true && false);  // false
		
		// 참 || 거짓 || 거짓 ?
		System.out.println(true || false || false);  // true
		
		// 참 || !거짓 && 참 ?
		System.out.println(true || !false && true);  // true
		
	}
}