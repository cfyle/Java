import java.util.List;

class Phone {}
class SamsungPhone extends Phone {}
class Iphone extends Phone{}

public class TestWildCards {
	public static void wildCard(List<? extends Object> objlist) {
		for (Object o : objlist) {
			System.out.println(o.toString());
		}
	}
	
	
	public static double getSum(List<? extends Number> list) {
		double sum = 0;
		for (Number n : list) {
			sum += n.doubleValue();
		}
		return sum;
	}
	
	public static void printAll(List<? extends Phone> phoneList) {
		
	}
	
	public static void main(String[] args) {
		List<SamsungPhone> samsungs = null;
		List<Iphone> iphones = null;
		
		printAll(samsungs);
		printAll(iphones);
		
		
	}
}
