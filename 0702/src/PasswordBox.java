
public class PasswordBox extends Box {
	private String password;

	public PasswordBox(int width, int length, int height, String password) {
		super(width, length, height);
		this.password = password;
	}

	public void printStatus(String role) { // Overload 
		if (role.equals("Admin")) {
			System.out.println("박스의 비밀번호 : " + password);
			super.printStatus();
			
		}
	}

	
}
