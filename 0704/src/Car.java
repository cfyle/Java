
public class Car {
	private String model;
	
	private static int count = 0;
	
	public Car(String model) {
		this.model = model;
		count++;
	}
	
	public static int getCount() {
		return count;
	}
}
