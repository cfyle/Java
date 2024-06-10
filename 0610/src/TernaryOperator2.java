
public class TernaryOperator2 {
	public static void main(String[] args) {
		int num = -3;
		
//		String result = (num > 0) ? "양수" : (num == 0) ? "Zero" : "음수";
		
		String result;
		if (num>0) {
			result = "양수";
		} else if (num == 0) {
			result = "Zero"; 
		} else {
			result = "음수";
		}
		System.out.println(result);
	}
}
