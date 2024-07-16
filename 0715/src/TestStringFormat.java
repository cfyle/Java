import java.io.File;
import java.time.LocalDate;
import java.util.Scanner;

public class TestStringFormat {
	public static void main(String[] args) {
		String result = String.format("%d", 15.15);
		
		System.out.println(result);
	
		LocalDate of = LocalDate.of(2024, 7, 15);
		
		LocalDate.of(2024, -1, -1);
	}
}
