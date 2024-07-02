// 전기차
// 속도
// 현재 배터리 용량

class ElectricCar extends Car {
	int battery;
	
	public ElectricCar() {
		super();
	}
	
	public void charge() {
		battery += 10;
	}
}




public class Car {
	int speed;
	
	public void increaseSpeed() {
		speed++;
	}
	
	public void decreaseSpeed() {
		speed--;
	}
	
	public static void main(String[] args) {
			ElectricCar ev = new ElectricCar();
			ev.increaseSpeed();
			ev.increaseSpeed();
			ev.increaseSpeed();
			
			System.out.println(ev.speed);
			
			ev.decreaseSpeed();
			
			System.out.println(ev.speed);
			ev.charge();
			
			System.out.println(ev.battery);
			
			
	}
	
}
