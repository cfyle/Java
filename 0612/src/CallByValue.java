
public class CallByValue {
	public int increase(int num) {
		num++;
		
		return num;
	}
	
	public static void main(String[] args) {
		CallByValue c = new CallByValue();
		int num = 10;
		
		num = c.increase(num);
		
		System.out.println(num);
	}
}
