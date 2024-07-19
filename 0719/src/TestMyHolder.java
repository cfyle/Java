
public class TestMyHolder {
	public static void main(String[] args) {
		MyImmutableHolder myHolder = new MyImmutableHolder(100);
		
		System.out.println(myHolder.getValue());
		
		// 문자열 한 개
		MyImmutableHolder myStr = new MyImmutableHolder("문자열");
		// 실수 한 개
		MyImmutableHolder myDbl = new MyImmutableHolder(44.44);
		
		Object value = myStr.getValue();
		
	}
}
