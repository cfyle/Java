import java.time.LocalDate;
import java.util.Calendar;

//
//
//	1. Calendar 또는 LocalDate를 사용해서 특정 달의 마지막 일 수를 찾아보세
//     1월, 3월, .... = > 31   /  4월, 6월 = >30 
//
//  2. 이번 달의 달력을 출력하기
//  2024-06-14 금
//  일   월   화   수   목   금   토
//                    01
//  02 03 04 05 06 07 08
//  09 10 11 12 13 14 15
//  16 17 18 19 20 21 22
//  23 24 25 26 27 28 29
//  30
//

public class Q {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		LocalDate now = LocalDate.now();
		
		for (int i = 1; i <= now.lengthOfMonth(); i++) {
			if (i == 8 || i == 15 || i == 22 || i == 30) {
				System.out.println();
			}
			System.out.print(i + " ");
	}
		
//		System.out.println(cal.get(Calendar.DATE));
//		System.out.println(cal.get(Calendar.MONTH));
//		System.out.println(now.getDayOfMonth());
//		System.out.println(now.getDayOfYear());
//		System.out.println(now.getMonth());
		
		System.out.println(now.lengthOfMonth());

		System.out.println(now.withDayOfMonth(14));
		
		// 주 구하기
		
		LocalDate today = now.plusDays(0);
		System.out.println(today + " " + now.getMonth());
		
		String week = String.join("   ", "일", "월", "화", "수", "목", "금", "토");
		
		
		
		String firstWeek = String.join(" ", "  ", "  ", "  ", "  ", "  ", "  ", "01" );
		
		String secondWeek = String.join(" ", "02", "03", "04", "05", "06", "07", "08");
		
		String thirdWeek = String.join(" ", "09", "10", "11", "12", "13", "14", "15");
		
		String forthWeek = String.join(" ", "16", "17", "18", "19", "20", "21", "22");
		
		String fifthWeek = String.join(" ", "23", "24", "25", "26", "27", "28", "29");
		
		String sixthWeek = String.join(" ", "30");
		
		System.out.println(week);
		System.out.println(firstWeek);
		System.out.println(secondWeek);
		System.out.println(thirdWeek);
		System.out.println(forthWeek);
		System.out.println(fifthWeek);
		System.out.println(sixthWeek);
	}
}
