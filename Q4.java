import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 5개 입력하시오");
		int loop = 5;

		int num = sc.nextInt();
		int max = num;
		int min = num;

		int i = 0;
		while (i < loop - 1) {
			num = sc.nextInt();
			if (max < num)
				max = num;
			if (min > num)
				min = num;
			i++;
		}

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

//		int max = -2_147_483_648; // Integer.MIN_VALUE; // 정수 최소값
//		int min = 2_147_483_647; // Integer.MAX_VALUE; // 정수 최대값
//		int i = 0;
//		while (i < loop) {
//			int num = sc.nextInt();
//			if (max < num)
//				max = num;
//			if (min > num)
//				min = num;
//			i++;
//		}
//
//		System.out.println("최대값 : " + max);
//		System.out.println("최소값 : " + min);

		sc.close();
	}
}
