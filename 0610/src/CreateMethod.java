public class CreateMethod {
	public static void hello() {
		System.out.println("안녕하세요");
	}
	
	public static void world() {
		System.out.println("월드");
	}
	
	public static void main(String[] args) {
		System.out.println("문장 흐름 1");
		hello();
		world();
		System.out.println("문장 흐름 2");
		hello();
		world();
		System.out.println("문장 흐름 3");
		world();
	}
}
