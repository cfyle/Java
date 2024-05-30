public class Integer {
	public static void main(String[] args) {
		// byte는 -128 ~ 127 까지를 나타낼 수 있는 정수 자료형 (크기 1바이트)
		byte b = 127;
		System.out.println(b);
		
		// short는 -32768 ~ 32767 까지를 나타낼 수 있는 정수 자료형 (크기 2바이트)
		
		// int는 -21억 ~ 21억 정도 까지를 나타낼 수 있는 정수 자료형 (4바이트)
		
		// long은 -920경 ~ 920경 정도 까지를 나타낼 수 있는 정수 자료형 (8바이트)
		
		long l = 92_837_498_373L;
		// 자리 수 표현은 ' _ ' 로 가능하고 int 형 보다 크면 뒤에 L 을 적어준다
		System.out.println(l);
	}
}