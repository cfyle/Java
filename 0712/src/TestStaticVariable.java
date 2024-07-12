class MyNumbers {
	public static int myNumber = 22;
	private static int yourNumber = 33;
	public static String word = "HELLO";
	
	public static String getWord() {
		return word;
	}

	public static int getYoutNumber() {
		return yourNumber;
	}

	public int instanceVar;
}

public class TestStaticVariable {
	public static void main(String[] args) {
		MyNumbers instance = new MyNumbers();
		System.out.println(MyNumbers.myNumber);
		instance.instanceVar = 12;

		MyNumbers instanceAnother = new MyNumbers();
		System.out.println(MyNumbers.myNumber);
		instanceAnother.instanceVar = 44;
	}
}
