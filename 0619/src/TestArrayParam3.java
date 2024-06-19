
public class TestArrayParam3 {
	public void printAll(int[] numbers) {
		if (numbers == null) {
			return;
		}
		
		for (int n : numbers) {
			
			System.out.println(n);
		}
	}
	
	public void printAllTwo(int[] numbers) {
		if (numbers == null) {
			return;
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	public static void main(String[] args) {
		TestArrayParam3 t = new TestArrayParam3();
		t.printAllTwo(null);
	}
}
