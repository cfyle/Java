import java.util.Scanner;

//3. 사용자에게 입력받은 정수의 약수를 모두 출력
//예) 10을 입력하면 1,2,5,10


public class Quiz3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("정수를 입력하세요");
		
		int i = 1;
		while(i <= num) {
			if (num % i == 0) {
				System.out.println(i);
			} i++;
		}
		
		
	}
}
