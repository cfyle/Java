package HotelDance;

public class Main {
	public static void main(String[] args) {
		HotelMain hm = new HotelMain();
		Body[][] body = hm.body;
		for (int i = 0; i < body.length; i++) {
			for (int j = 0; j < body[i].length; j++) {
				body[i][j] = new Body(((100 * (i + 2)) + (j + 1)), 0, 
						"", "", "", 0, new Service(false, false, false));
			}
		}
		hm.login();
	}
}