public class Mod3 {
	public static void main(String[] args) {
		int seconds = 133;
		
		// 위 변수는 초 단위의 값입니다.
		// xx 분 xx 초로 변환하여 출력해보세요.
		
		int minutes = 60;
		
		System.out.println((seconds / minutes) + "분 " + (seconds % minutes) + "초"); 
	}
}