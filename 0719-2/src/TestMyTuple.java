public class TestMyTuple {
	public static void main(String[] args) {
		MyTuple<Integer, String> tuple = new MyTuple<Integer, String>(100, "백");
		
		System.out.println(tuple.getKey());
		System.out.println(tuple.getValue());
	}
}
