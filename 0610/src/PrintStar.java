
public class PrintStar {
	
	public static void printStar(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		for (int i = 5; i >=1; i--) {
			printStar(i);
		}
	}
}
