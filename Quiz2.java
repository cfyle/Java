// 2. 사과가 여러개 있을 때, 포장을 하려고 합니다.
// 한 상자에 들어갈 수 있는 사과 개수와 총 사과 개수를 입력받고
// 필요한 사과 박스 개수와, 상자를 채우지 못해 포장이 되지않는 사과 개수를 출력

// 입력예)
// 박스 : 10
// 총사과 : 65
// 출력예) 포장된 사과 박스 : 6개, 포장되지 않은 사과 개수 : 5개

import java.util.Scanner;

public class Quiz2 {	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("사과가 들어갈 수 있는 상자 수는?");
		int box = s.nextInt();
		
		System.out.println("총 사과의 개수는?");
		int apple = s.nextInt();
		
		int fullBox = apple / 10;
		int  = apple % 10;
		
		
		
		System.out.println("포장된 사과 박스 : " + fullBox + "개, 포장되지 않은 사과 개수 : " +  + "개"); 
		
		
	}
}