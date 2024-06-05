/* 
 * 사용자에게 무작위 (2 ~ 9)의 정수를 제시하고
 * 해당 수의 배수를 순서대로 입력해야하는 프로그램
 * 
 * 예) 3 의 배수를 입력하세요
 * 3
 * 6
 * 9
 * 11
 * ...
 * 
 * - 종료 : 총 3개를 입력했습니다. -
 */
import java.util.Scanner;
import java.util.Random;

public class LoopControl3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		int generatedNumber = r.nextInt(8) + 2;
		System.out.println(generatedNumber + " 의 배수를 입력하세요");
		
		int count = 1;
		int answer;
		while(true) {
			answer = generatedNumber * count;
			int userInput = s.nextInt();
			
			if (userInput != answer) {
				break;
			}
			count++;
		}
		System.out.println(count - 1 + "개를 입력했습니다");
	}

}
