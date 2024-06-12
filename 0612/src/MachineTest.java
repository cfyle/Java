
public class MachineTest {
	public static void main(String[] args) {
		Machine m = new Machine();
		m.print();
		
		m.pritn2();
		
		m.print(10);
		
		m.print(3.14);
		
		m.print(12, 30.2);
		
		m.print(1.41, 44);
		
// 		m.print("문자열");   컴파일 오류
	}
}
