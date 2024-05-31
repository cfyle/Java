public class AutoIncrement3 {
	public static void main(String[] args) {
		byte b = 127;
		// b의 값을 1 증가시키고 결과값 확인
		// b++; // overflow
		// b += 1;
		
		double d = 1.5;
		// d의 값을 1 증가시키고 결과값 확인
		
		b++;
		System.out.println(b);
		
		d++;
		System.out.println(d);
	}
}