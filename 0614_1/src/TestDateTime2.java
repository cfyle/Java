import java.util.Calendar;

public class TestDateTime2 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH));
		
		System.out.println("5월은 " + Calendar.MAY);
		System.out.println("6월은" + Calendar.JUNE);
		
		System.out.println(now.get(Calendar.DAY_OF_MONTH) + now.get(Calendar.DAY_OF_WEEK));
		// 일1 월2 화3 수4 ...
		System.out.println(now.get(Calendar.DAY_OF_WEEK));
		System.out.println("일요일은" + Calendar.SUNDAY);
		System.out.println("토요일은 " + Calendar.SATURDAY);
		
		Calendar tomorrow = Calendar.getInstance();
		tomorrow.add(Calendar.DATE, 1);
		System.out.println(tomorrow.get(Calendar.DAY_OF_MONTH));
		
	}
}
