import java.util.Scanner;

// 자판기
// 콜라, 2000
// 사이다, 1800
// 환타, 1500

// 모든 제품의목록을 출력 가능

// 제품명을 파라미터로 전달받으면 가격을 출력하는 기능

// VendingMachine 참조

public class TestRefArray7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		VendingMachine vm = new VendingMachine();
		vm.printMenus();
		
		System.out.println("1.메뉴명으로 찾기   2.메뉴번호로 찾기");
		int selectNum = scanner.nextInt();
		scanner.nextLine();
		
		if (selectNum == 1) {
			System.out.println("메뉴명을 입력해주세요");
			String input = scanner.nextLine();
			
			vm.process(input);
		} else if (selectNum == 2) {
			System.out.println("메뉴번호를 입력해주세요");
			int input = scanner.nextInt();
			
			vm.printPrice(input);
		}
	}
}
