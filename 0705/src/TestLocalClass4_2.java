interface IntMethod {
	int mymethod(int a, int b);
}

class SumCal implements IntMethod{
	public int mymethod(int a, int b) {
		return a + b;
	}
}

class MinusCal implements IntMethod {
	public int mymethod(int a, int b) {
		return a - b;
	}
}

//public class TestLocalClass4_2 {
//	public static void printResult(IntMehtod obj) {
//		int result = obj.mymethod(10, 5);
//		System.out.println(result);
//	}
//	
//	public static void main(String[] args) {
//	
//	}
//	
//}
