class OuterClass {
	private int num;

	private class InnerClass {
		public void increaseNum() {
			num++;
		}
	}

	public void doSomething() {
		InnerClass innerClass = new InnerClass();
		innerClass.increaseNum();
	}

	public void printNum() {
		System.out.println(num);
	}

}

public class TestInnerClass {
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		outerClass.doSomething();
		outerClass.printNum();
		
		
		
		
//		class LocalClass {
//		}
//		new LocalClass();

//		new InnerClass();
//
//		OuterClass outerClass = new OuterClass();
//		OuterClass innerClass = outerClass.new InnerClass();
	}
}
