import java.time.LocalDate;
import java.util.List;
import java.util.Map;

class 일기 {
	String 날씨;
	String 내용;
}

public class MyDayLog {
	public static void main(String[] args) {
		// 날짜, 일기 내용
		// 24-07-18, 날씨: 맑음, 내용: 맵을 배움, 지출: 10000
		// 24-07-17, 날씨: 비, 내용: 춘식이 생일, 수입: 3000
		// 24-08-15, 날씨: 구름, 내용: 광복절, 메모: 태극기 달 것
		
		Map<LocalDate, String> diary;
		
		// 24-07-18 뒤늦게 삼계탕을 먹음
		Map<LocalDate, List<String>> diary2;
		
		Map<LocalDate, 일기> diary3;
		
	}
}
