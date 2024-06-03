
public class TestBlock {
	public static void main(String[] args) {
		{} // block scope 범위
		{
			int var = 33;
			System.out.println(var);
		}
//		System.out.println(var); // 블럭을 벗어나면 컴파일 에러
		{
			{
			
			}
		}
		int num = 10;  // 지역 변수 (local variable) 
		// main 안에 있는 지역변수
		
		System.out.println(num);
	} // 블럭의 끝과 함께 지역변수는 사라진다
}
