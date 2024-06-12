
public class RefTypeReturn {
	public String apple() {
		return "Apple";
	}
	
	public static void main(String[] args) {
		RefTypeReturn r = new RefTypeReturn();
		String result = r.apple();
		
		System.out.println(result);
	}
}
