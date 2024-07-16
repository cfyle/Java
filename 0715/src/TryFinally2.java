public class TryFinally2 {

	public static int select(int menu) {
		try {
			if (menu == 1) {
				return 1500;
			} else if (menu == 2) {
				return 2000;
			} else {
				return 3000;
			}
		} finally {
			System.out.println("도달할 수 없는 문장");
		}
	}

	public static void main(String[] args) {

		try {
			System.out.println("문장");
			select(3);
		} finally {
			System.out.println("언제나 실행");
		}
	}
}
