// 6. 초단위의 시간을 입력받아
// # 시 # 분 # 초로 단위 환산하여 출력하는 프로그램
// 입력예) 3666 => 출력예) 1시간 1분 6초

import java.util.Scanner;

public class Quiz6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("초단위를 입력하세요");
		
		int second = s.nextInt();
		
		int hour = second / 3600; 
		
		int minute = (second % 3600) / 60 ; 
		
		int seconds = (second % 3600) % 60 ;
		
		System.out.println( hour + "시" + minute + "분" + seconds + "초");
	}
}