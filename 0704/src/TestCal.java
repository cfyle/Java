
public class TestCal {
	public static void main(String[] args) {
		Calculatable calculatable = new Calculator();
		Calculatable calculatable2 = new Computer();
		Minusable minusable = new Calculator();
		int minus = minusable.minus(100, 50);
		System.out.println(minus);

		
		System.out.println("=========================");
		
		int sum = calculatable.sum(20, 30);
		System.out.println(sum);
		
		int sum2 = calculatable2.sum(10, 5);
		System.out.println(sum2);
	}
}
