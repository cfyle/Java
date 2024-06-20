// Car
// 차종 : String
// 현재속도 : int

// 모든 필드 Constructor, getter/setter
// Car 클래스 참조

public class TestRefArray5 {

	public static void main(String[] args) {
		// Car 배열을 선언하고,
		// 아반떼, 40
		// 소나타, 50
		// 그랜저, 60
		// 을 원소로 가지는 인스턴스 초기화
		Car[] cars = null;
		cars = new Car[3];
		System.out.println("배열의 길이 확인 : " + cars.length);

		cars[0] = new Car("아반떼", 40);
		cars[1] = new Car("소나타", 50);
		cars[2] = new Car("그랜저", 60);

		for (int i = 0; i < cars.length; i++) {
			cars[i].printState();
			
			// 아래 대신 위를 사용
//			System.out.println(cars[i].getType());
//			System.out.println(cars[i].getCurrentSpeed());
		}

	}
}
