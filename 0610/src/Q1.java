import java.util.Scanner;

// 가위바위보 게임
public class Q1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("플레이어1님 가위바위보를 입력하세요");
		int player1 = s.nextInt();

		System.out.println("플레이어2님 가위바위보를 입력하세요");
		int player2 = s.nextInt();

		switch (player1) {
		case 1:
			System.out.println("플레이어1님 바위");
			break;
		case 2:
			System.out.println("플레이어1님 가위");
			break;
		case 3:
			System.out.println("플레이어1님 보");
			break;
		default:
			System.out.println("잘못입력하셨습니다. 1.가위 2.바위 3.보 중에 숫자 하나를 입력하세요");
			break;
		}

		switch (player2) {
		case 1:
			System.out.println("플레이어2님 바위");
			break;
		case 2:
			System.out.println("플레이어2님 가위");
			break;
		case 3:
			System.out.println("플레이어2님 보");
			break;
		default:
			System.out.println("잘못입력하셨습니다. 1.가위 2.바위 3.보 중에 숫자 하나를 입력하세요");
			break;
		}

		System.out.println("----------------------");

		if (player1 == 1) {
			if (player2 == 1) {
				System.out.println("무승부");
			} else if (player2 == 2) {
				System.out.println("플레이어1님 승리");
			} else if (player2 == 3) {
				System.out.println("플레이어2님 승리");
			}
		} else if (player1 == 2) {
			if (player2 == 2) {
				System.out.println("무승부");
			} else if (player2 == 3) {
				System.out.println("플레이어1님 승리");
			} else if (player2 == 1)
				System.out.println("플레이어2님 승리");
		}

		else if (player1 == 3) {
			if (player2 == 3)
				System.out.println("무승부");
			else if (player2 == 1) {
				System.out.println("플레이어1님 승리");
			} else if (player2 == 2) {
				System.out.println("플레이어2님 승리");
			}
		}
	}
}
