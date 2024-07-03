import java.util.Random;
import java.util.Scanner;

public class TestStandardLib {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		Random r1 = new Random(100);
		Random r2 = new Random(100);
		
		System.out.println(scan1.equals(scan2));
		
		System.out.println(r1.equals(r2));
	}
}
