
public class LoopControl4 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (1 % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
