interface DoSomething {
	int doSomething(int a, int b);
}


public class TestLocalClass4 {
	public static void printResult(DoSomething ref) {
		int result = ref.doSomething(10, 5);
		
		System.out.println(result);
	}
	
	
	public static void main(String[] args) {
		printResult(new DoSomething() {
			@Override
			public int doSomething(int a, int b) {
				return a + b;
			}
		});
		
		
		printResult(new DoSomething() {
			@Override
			public int doSomething(int a, int b) {
				return a - b;
			}
		});
	}
}
