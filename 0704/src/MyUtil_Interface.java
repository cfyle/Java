
public interface MyUtil_Interface {
	int num = 0; //public, static, final 이 생략
//	public static final int num = 0;
	int a = 4;
	
	public static void print() {
		System.out.println("출력");
	}
	
	public static void main(String[] args) {
		System.out.println(MyUtil_Interface.num);
//		MyUtil_Interface.num++;
	}
}
