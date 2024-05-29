public class Score {
	public static void main(String[] args) {
		double kor = 80;
		double eng = 75;
		double math = 65;
		
		// 위의 국 영 수 점수의 총합
		
		double sum = kor + eng + math;
		double average = sum / 3;
		
		System.out.println("국영수의 총합은 : " + sum + " 입니다.");
		System.out.println("국영수의 평균은 : " + average + " 입니다.");
	}
}