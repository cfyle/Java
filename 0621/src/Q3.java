import java.util.Scanner;

// 3. 사용자에게 정수 10개를 입력받아
//    각 입력의 빈도 출력하는 프로그램
//    (작은 수부터 출력)
//    10, 3, 3, 2, ...
//    => 2 : 1회 || 3: 2회 || ... || 10: 1회

public class Q3 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 배열 선언
		int[] arr = new int[10];
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
		int count9 = 0;
		int count10 = 0;
		
		// 사용자 입력
		System.out.println("정수를 10번 입력하세요");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
			
			// 조건
			if (arr[i] == 1) {
				count1 ++;
			} else if (arr[i] == 2) {
				count2 ++;
			} else if (arr[i] == 3) {
				count3 ++;
			} else if (arr[i] == 4) {
				count4 ++;
			} else if (arr[i] == 5) {
				count5 ++;
			} else if (arr[i] == 6) {
				count6 ++;
			} else if (arr[i] == 7) {
				count7 ++;
			} else if (arr[i] == 8) {
				count8 ++;
			} else if (arr[i] == 9) {
				count9 ++;
			} else if (arr[i] == 10) {
				count10 ++;
			} else {
				System.out.println("잘못입력하셨습니다 | 1 ~ 10 의 번호만 입력해주세요");
				System.out.println("카운트는 차감됩니다");
			}
			
		}
		
		//출력
		System.out.println("1 : " + count1 + "번");
		System.out.println("2 : " + count2 + "번");
		System.out.println("3 : " + count3 + "번");
		System.out.println("4 : " + count4 + "번");
		System.out.println("5 : " + count5 + "번");
		System.out.println("6 : " + count6 + "번");
		System.out.println("7 : " + count7 + "번");
		System.out.println("8 : " + count8 + "번");
		System.out.println("9 : " + count9 + "번");
		System.out.println("10 : " + count10 + "번");
		
	}
}