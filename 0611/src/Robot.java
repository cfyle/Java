public class Robot {
	boolean isOn;
	
	public void turnOn() {
		isOn = true;
	}
	
	public void turnOff() {
		isOn = false;
	}
	
	public void sayHello() {
		if (isOn) {
			System.out.println("안녕");
		} else {
			System.out.println("전원이 꺼져있어...");
		}
	}
	
}
