import java.time.LocalDate;
import java.util.Scanner;

class BirthDay {
	private LocalDate day;

	public BirthDay(LocalDate day) {
		super();
		this.day = day;
	}

	public LocalDate getDay() {
		return day;
	}

	public void setDay(LocalDate day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "BirthDay [day=" + day + "]";
	}

}

interface DateValidator {
	boolean 맞안맞(int year, int month, int dayOfMonth);
}

class DateValidatorImpl implements DateValidator {
	@Override
	public boolean 맞안맞(int year, int month, int dayOfMonth) {
		try {
			LocalDate.of(year, month, dayOfMonth);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}

public class TestDataParser {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("생년을 입력하세요");
		int year = scanner.nextInt();
		System.out.println("월을 입력");
		int month = scanner.nextInt();
		System.out.println("일을 입력");
		int dayOfMonth = scanner.nextInt();

		DateValidatorImpl validator = new DateValidatorImpl();
		boolean result = validator.맞안맞(year, month, dayOfMonth);

		if (result) {
			LocalDate inputDate = LocalDate.of(year, month, dayOfMonth);
			new BirthDay(inputDate);
		} else {
			System.out.println("잘못된 입력");
		}
	}
}
