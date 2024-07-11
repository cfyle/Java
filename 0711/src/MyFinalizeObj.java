
public class MyFinalizeObj {
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		
		// 개발자가 직접 명시적 호출을 하기 위한 메소드가 아님
		// GC(Garbage Collector)에 의해 호출됨
		// 객체 소멸 최종단계에서 자원 해제 등의 필요한 동작을 구현할 수 있음
		System.out.println("호출 확인");
	}

	public static void main(String[] args) {
		MyFinalizeObj m = new MyFinalizeObj();
		m = null;
		
		System.gc(); // 명시적 호출 권장 X
		
		System.out.println("프로그램 종료");
	}
}
