/* 
 *   사용자의 키 (m) 와 체중(kg)을 입력받아
 *   BMI 지수를 출력하는 프로그램
 *   BMI = 체중(kg) / 키(m)의 제곱
 *   
 *   대한비만학의회 BMI 지수 평가 기준
 *   18.5 미만 => 저체중
 *   18.5 이상 ~ 23 미만 => 정상
 *   23 이상 ~ 25 미만 => 과체중
 *   25 이상 ~ 30 미만 => 1단계 비만
 *   30 이상 ~ 35 미만 => 2단계 비만
 *   35 이상 => 고도비만
 */
import java.util.Scanner;

public class Control11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("사용자의 키(m)를 입력하세요");
		double height = scanner.nextDouble();
		
		System.out.println("사용자의 체중(kg)을 입력하세요");
		double weight = scanner.nextDouble();
		
		double bmi = weight / (height * height);
		
		if (bmi < 18.5) {
			System.out.println("저체중 입니다. 더드세요");
		} else if (18.5 <= bmi && bmi < 23) {
			System.out.println("정상 입니다. 유지하세요");
		} else if (23 <= bmi && bmi < 25) {
			System.out.println("과체중 입니다. 주의하세요");
		} else if (25 <= bmi && bmi < 30) {
			System.out.println("1단계 비만 입니다. 조금 덜드세요");
		} else if (30 <= bmi && bmi < 35) {
			System.out.println("2단계 비만 입니다. 조금만 드세요");
		} else {
			System.out.println("고도 비만 입니다. 굶으세요");
		}
	}
}
