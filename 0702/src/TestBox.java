// 색상이 있는 박스
// 가로, 세로, 높이, 색상
// 부피 반환
// 모든 필드 출력

// 비밀번호가 설정된 박스
// 가로, 세로, 높이, 비밀번호
// 부피 반환
// (비밀번호를 제외한) 모든 필드 출력
// (비밀번호를 포함한) 모든 필드 출력 (역할(String) 값을 전달받아 "Admin"한 경우)


public class TestBox {
	public static void main(String[] args) {
		ColorBox redBox = new ColorBox(10, 20, 30, "빨강");
		redBox.printStatus();
		
		System.out.println("===================");
		
		PasswordBox pwBox = new PasswordBox(20, 20, 20, "qwer");
		pwBox.printStatus();
		pwBox.printStatus("Admin");
		
	}
}
