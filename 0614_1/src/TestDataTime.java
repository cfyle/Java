import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestDataTime {
	public static void main(String[] args) {

		String date = "2024-06-14";
		Calendar cal = Calendar.getInstance();
		
		cal.set(1, 2027);
		
		
		
		
		System.out.println(cal.get(1));
		System.out.println(cal.get(2));
		System.out.println(cal.get(3));
//		
//		Date date = cal.getTime();
//		System.out.println(date.toString());
//		
//		SimpleDateFormat dateFormat = new SimepleDateFormat("GG/yyyy-MM-dd hh:mm:ss") {
//			String formmated = dateFormat.format(date);
//			private void sout() {
//		}
	}
		}

