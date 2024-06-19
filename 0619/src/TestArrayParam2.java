
public class TestArrayParam2 {
	public void printAll(String word, int... numbers) {  // 가변 길이 파라미터는 순서상 맨마지막에 
		System.out.println(word);
		
		System.out.println("numbers 길이 : " + numbers.length);
		
		for (int n : numbers) {
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		TestArrayParam2 t = new TestArrayParam2();
		t.printAll("문자열", 1, 2, 3, 4, 5, 6, 7);
		
		t.printAll("Hello");
	}
}
