
public class StaticBolock {
	static {
		System.out.println("스태틱 블럭");
		System.out.println("JVM에 의해 실행됨");
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		System.out.println("프로그램 종료");
	}
}
