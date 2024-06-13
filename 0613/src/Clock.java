// 시계
// 현재시 : int
// 현재분 : int
// 현재초 : int

// 모든 필드를 초기화 하는 생성자
// 시, 분 필드를 초기화 하는 생성자2
// 시 필드를 초기화 하는 생성자3

public class Clock {
	int hour;
	int minute;
	int second;
	
	public Clock(int hour) {
		this(hour, 0, 0);   // 첫문장이어야 한다
		int a;
		System.out.println("메소드 호출");
	}
	
	public Clock(int hour, int minute) {
		this(hour, minute, 0);		
//		setHour(hour);
//		setMinute(minute);
		
	}

	public Clock(int hour, int minute, int second) {
//		this.hour = hour;
		setHour(hour);
		
//		this.minute = minute;
		setMinute(minute);
		
//		this.second = second;
		setSecond(second);
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public void setHour(int hour) {
		if (0 <= hour && hour <= 23) {
			this.hour = hour;
		}
	}

	public void setMinute(int minute) {
		if (0 <= minute && minute < 60) {
			this.minute = minute;
		}
	}

	public void setSecond(int second) {
		if (0 <= second && second < 60) {
			this.second = second;
		}
	}

	// 각각의 필드에 접근할 수 있는 getter를 완성

	// setHour(int) : void
	// 0 ~ 23

	// setMinute(int) : void
	// 0 ~ 59

	// setSecond(int) : void
	// 0 ~ 59

	public void printTime() {
//		System.out.println("현재시간은 ");
//		System.out.println(this.hour + "시");
//		System.out.println(this.minute + "분");
//		System.out.println(this.second + "초");

		System.out.printf("%d시 %d분 %d초\n", this.hour, this.minute, this.second);
	}

	public static void main(String[] args) {

		Clock c = new Clock(3, 32, 55);

		c.printTime();
		
		Clock c2 = new Clock(23, 44);
		c2.printTime();
		
		Clock c3 = new Clock(12);
		c3.printTime();
	}
}
