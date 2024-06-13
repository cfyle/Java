// 컵
// 용량
// 손잡이 유무

// 위 필드를 모두 초기화 할 수 있는 생성자 작성해보기
public class Cup {
	
	double volume;
	boolean handle;
	
	public Cup(double v) {
		volume = v;
//		handle = false;    // 지워도 기본값이 false 이기때문에 false
	}
	
	public Cup(double v, boolean h) {
		volume = v;
		handle = h;
	}
	
	public void printState () {
		System.out.println("용량 : " + volume);
		System.out.println("손잡이 유무 : " + handle);
	}
	
	public static void main(String[] args) {
		// 작성한 생성자료
		// 용량이 100 이고, 손잡이가 없는 컵 인스턴스 생성
		
		// 용량이 200 이고, 손잡이가 있는 컵 인스턴스 생성
		
		Cup c1 = new Cup(100, false);
//		System.out.println(c1.volume);
//		System.out.println(c1.handle);
		c1.printState();
		
		System.out.println("======================");
		Cup c2 = new Cup(200, true);
//		System.out.println(c2.volume);
//		System.out.println(c2.handle);
		c2.printState();
		
		Cup c3 = new Cup(300.0);
		Cup c4 = new Cup(400.0);
		c3.printState();
		c4.printState();
	}

}
