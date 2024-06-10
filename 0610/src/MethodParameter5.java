import java.util.Scanner;

// 사용자에게
// 국, 영, 수 점수를 입력받아
// 총점을 출력하는 프로그램
public class MethodParameter5 {
	
	public static void printSum(int kor, int eng, int math) {
		System.out.println(kor + eng + math);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어");
		int kor = scanner.nextInt();
		
		System.out.println("영어");
		int eng = scanner.nextInt();
		
		System.out.println("수학");
		int math = scanner.nextInt();
		
//		System.out.println(kor + eng + math);
		
		printSum(kor, eng, math);
		
	}
}
