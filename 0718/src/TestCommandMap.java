import java.util.HashMap;
import java.util.Map;

public class TestCommandMap {
	
	
	public static void main(String[] args) {
		// "+", "=", "*"
		int a = 10;
		int b = 5;
		
		String command = "*";
//		Map<String, Calculation> map = new HashMap<>();
		
		
		if (command.equals("+")) {
			System.out.println(a + b);
		} else if (command.equals("-") ) {
		 System.out.println(a - b);
		} else if (command.equals("*")) {
			System.out.println(a * b);
		}
	}
}
