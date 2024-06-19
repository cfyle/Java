package process;
import java.util.Scanner;
import my.MyClass;
import my.MyObject;
import my.child.MyChildClass;

public class Main {
	public static void main(String[] args) {
		MyClass my = new MyClass();
		
		my.field1 = "접근 가능. 퍼블릭";
		System.out.println(my.field1);
		
//		my.field2 = "접근 불가능 (보이지 않음). 패키지/디폴트"; // 같은 패키지에서만 접근 가능 		
//		my.field3 = "접근 불가능(보이지않음). 프라이빗";
		
		
//		MyObject myObj = new MyObject();  // 패키지가 달라서 컴파일에러 -> import my.MyObject;  작성
//		MyChildClass myChild;	
		
		
//		YourClass your;  // 디폴트 패키지는 import 불가능
	}
}
