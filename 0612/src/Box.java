import java.util.Scanner;

// 상자
// 색깔
// 가로
// 세로
// 높이
// ---
// 부피를 구해 반환하는 행동

public class Box {
	
	String color;
	int length;
	int width;
	int height;
	int volume;
	
	public int getVolume() {
		return length * width * height;
	}
	
	
	public static void main(String[] args) {
		// 사용자에게 박스의 가로, 세로, 높이를 입력받아
		// 부피를 구해 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);
		System.out.println("박스의 가로, 세로, 높이를 입력해 주세요");
		Box box = new Box();
		box.width = scanner.nextInt();
		box.length = scanner.nextInt();
		box.height = scanner.nextInt();
		
		System.out.println("박스의 부피는 : " + box.getVolume());
	
//		Box b = new Box();
//		b.color = "blue";
//		b.length = 24;
//		b.width = 11;
//		b.height = 15;
//		
//		System.out.println(b.getVolume());		
	}
}
