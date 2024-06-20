// TestRefArray5 클래스 참조
public class Car {
	private String type;
	private int currentSpeed;
	public Car(String type, int currentSpeed) {
		super();
		this.type = type;
		this.currentSpeed = currentSpeed;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
	public void printState() {
		System.out.println("차종 : " + type);
		System.out.println("현재속도 : " + currentSpeed);
	}
	
}
