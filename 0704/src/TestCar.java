public class TestCar {
	public static void main(String[] args) {
		Car c1 = new Car("소나타");
		Car c2 = new Car("아반떼");
		Car c3 = new Car("그랜저");
		
		int count = Car.getCount();
		System.out.println(count);
		
//		System.out.println(Car.count);
//		Car.count = 438;
//		System.out.println(Car.count);
	}
}
