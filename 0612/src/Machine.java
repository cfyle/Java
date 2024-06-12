public class Machine {

// head : 메소드의 정의 (리턴타입, 이름, 파라미터
	public void print() {
		// body : 메소드의 구현 문장
		System.out.println("출력 기능 동작");
	}
//	public void print() {} 메소드이름이 같으면 컴파일 오류

	public void pritn2() {
		System.out.println("두번째 출력 기능 동작");
	}

	// 파라미터 (안의 내용) 구성이 다른 경우 : 개수
	public void print(int num) {
		System.out.println(num + " 출력 기능 동작");
	}

	// 파라미터 (안의 내용) 구성이 다른 경우 : 타입
	public void print(double num) {
		System.out.println(num + " 출력 기능 동작");
	}

	// 파라미터 구성이 다른 경우 : 순서
	public void print(int num, double num2) {
		System.out.println("출력 기능 동작 " +  num + " + " + num2);
	}
	public void print(double num, int num2) {}
	
	// 파라미터 이름이 다른 경우는? 컴파일 오류
//	public void print(int numnum) {}

}
