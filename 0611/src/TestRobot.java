// 로봇 클래스 작성
// 전원을 나타내는 isOn 논리값을 필드로 가집니다.
// 전원 킬 수 있는 동작(메소드) : isOn => true
// 전원 끌 수 있는 동작(메소드) : isOn => false
// "안녕" 이라고 말을 할 수 있음 (콘솔 출력)


public class TestRobot {
	public static void main(String[] args) {
		Robot r = new Robot();
		r.turnOn();
		r.sayHello();
		
		r.turnOff();
		r.sayHello();
	}
}
