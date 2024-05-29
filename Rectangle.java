public class Rectangle {
	public static void main(String[] args) {
		// 아래의 변수는 직사각형의 가로 세로 값입니다.
		
		int width = 53;
		int height = 80;
		
		// 직사각형의 넓이를 구해 출력해보세요
		
		System.out.println("직사각형의 가로 길이 : " + width);
		System.out.println("직사각형의 세로 길이 : " + height);
		System.out.println("직사각형의 넓이 : " + width * height + " 입니다.");
		
		int area = width * height;
		System.out.println(area);
		
		// 직사각형의 둘레를 구해 출력해보세요
		// System.out.println("직사각형의 둘레 : " + (width + height) * 2);
		
		int sum = width + height;
		int perimeter = sum * 2;
		System.out.println("직사각형의 둘레 : " + perimeter);
	}
}