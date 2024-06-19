
public class ReturnRef {
	public String createString(int num) { // 1이면 Hello, else면 World
		if (num == 1) {
			return new String("Hello");
		}
		return new String("World");
	}

	public static void main(String[] args) {
		ReturnRef r = new ReturnRef();

		String return1 = r.createString(1);
		String return2 = r.createString(0);
		String return3 = r.createString(-1);

		System.out.println(return1);
		System.out.println(return2);
		System.out.println(return3);
	}
}
