class Car {
	int speed;
	
	public void accel() {
		speed += 1;
	}
	
	public void printCurrentSpeed() {
		System.out.println("현재 속도는 " + speed);
	}
}

public class TestObject7 {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.speed = 100;
		c1.accel();
		
		System.out.println(c1.speed);
		c1.printCurrentSpeed();
	}
}
