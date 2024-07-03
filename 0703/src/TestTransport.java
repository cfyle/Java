// 다음의 객체는 
// 현재 속도를 상태로 가지며
// 현재 속도를 증가시키는 동작을 할 수 있습니다.
abstract class Transport {
	protected int speed;

	public Transport(int speed) {
		super();
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public abstract void speedUp();
}

// 자전거
// 속도 증가 시, 현재 속도에서 2만큼 증가

class Bicycle extends Transport {

	public Bicycle(int speed) {
		super(speed);
	}

	@Override
	public void speedUp() {
		setSpeed(getSpeed() + 2);
	}
}

// 승용차
// 속도 증가 시, 현재 속도에서 5만큼 증가
class Car extends Transport {

	public Car(int speed) {
		super(speed);
	}

	@Override
	public void speedUp() {
		setSpeed(getSpeed() + 5);
	}

}

// 스포츠카
// 속도 증가 시, 현재 속도에서 10만큼 증가
class SportsCar extends Transport {

	public SportsCar(int speed) {
		super(speed);
	}

	@Override
	public void speedUp() {
		setSpeed(getSpeed() + 10);
	}

}

public class TestTransport {
	public static void main(String[] args) {
		Bicycle bicycle = new Bicycle(10);
		bicycle.speedUp();
		
		System.out.println(bicycle.getSpeed());
	}
}
