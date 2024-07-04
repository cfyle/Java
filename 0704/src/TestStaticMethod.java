class MyUtil {
	public static void printSomething() {
		System.out.println("출력");
	}
	public static int sum(int a, int b) {
		return a + b;
	}
}
public class TestStaticMethod {
	public static void main(String[] args) {
		MyUtil.printSomething();
		int sum = MyUtil.sum(100, 200);
		System.out.println(sum);
		
		System.out.println(Math.max(10, 20));
		double random = Math.random();
		System.out.println(random);
		
		int num = (int) (Math.random() * 10);
		System.out.println(num);
	}
}
