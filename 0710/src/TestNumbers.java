
public class TestNumbers {
	public static void main(String[] args) {
		int i = 10;
		double d = (double) i; // 형 변환(확장)
		
		Integer box = i; // Boxing
		
//		i.toString();
		box.toString();
		
		Object obj = box; // up-casting
		System.out.println(obj.toString());
		
	}
}
