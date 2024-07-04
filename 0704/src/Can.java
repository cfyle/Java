interface CanType {
	int COLA = 1;
	int CIDAR = 2;
	int FANTA = 3;

	public static String getCanName(int canType) {
		switch (canType) {
		case 1:
			return "콜라";
		case 2:
			return "사이다";
		case 3:
			return "환타";
		default:
			return null;
		}
	}
}

public class Can {
	int type;

	public Can(int type) {
		super();
		this.type = type;
	}

	public static void main(String[] args) {
		Can c = new Can(CanType.COLA);
		Can c2 = new Can(1);

		String name = CanType.getCanName(c.type);
		System.out.println(name);
	}
}
