import java.time.LocalDate;

public class TestLocalDate {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now.toString());
		System.out.println("-----------");
		System.out.println(now.getYear());
		System.out.println(now.getMonth());
		System.out.println(now.getMonthValue());
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getDayOfWeek().getValue());
		
		System.out.println("------------------");
		LocalDate tomorrow = now.plusDays(1);
		System.out.println(tomorrow);
		
		LocalDate lastDay = LocalDate.of(2024, 12, 31);
		System.out.println(lastDay);
		
		LocalDate parsing = LocalDate.parse("2024-08-30");
		System.out.println(parsing);
	}
}
