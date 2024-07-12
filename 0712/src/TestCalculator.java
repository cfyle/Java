class Calculator {
	
	private static Calculator instance = new Calculator();
	
	public static Calculator getInstance() {
		return instance;
	}
	
	private Calculator() {}
	
	
	public int sum(int a, int b) {
		return a + b;
	}
	// minus, multiply...
}

class CLIProgram {
	public void printSum() {
		int userInputLeft = 10;
		int userInputRight = 100;

		Calculator.getInstance().sum(userInputLeft, userInputRight);
	}
}

public class TestCalculator {
	public static void main(String[] args) {
//		Calculator.getInstance = null;
//		new Calculator();
//		
		
		Calculator c = Calculator.getInstance();
		c.sum(10, 100);

		// ...

	}
}
