/*
 *  1. 히스토그램 (분포도)
 *     사용자에게 정수 10번을 입력받아 ( 0 ~ 100)
 *     다음과 같이 출력하는 프로그램
 *     
 *     입력예) 0 9 13 ... 88 81 83 95
 *     
 *     0 ~ 10 : **
 *     11 ~ 20 : *
 *     21 ~ 30 : 
 *     ...
 *     81 ~ 90 : ***
 *     91 ~ 100 : *
 *     
 *     
 *  3. TestArrayLoop 8번 미완성 메소드 작성  
 *         
 */
public class Q {
	
	public static void main(String[] args) {
		
		// 2. 두 정수 배열이 길이가 같고, 원소가 같음을 확인하기				
		int[] num1 = new int[] { 1, 2, 3, 4 };
		int[] num2 = new int[] { 1, 2, 3, 4 };
		int[] num3 = new int[] { 1, 2, 3 };
		
		System.out.println(num1 == num2);
		System.out.println(num2 == num3);
		System.out.println(num1 == num3);
	}

}
