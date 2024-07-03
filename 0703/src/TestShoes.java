
public class TestShoes {
	public static void main(String[] args) {
		Shoes s1 = new Shoes("에어포스1", 150000);
		Shoes s2 = new Shoes("에어포스1", 110000);
		
		Shoes s3 = new Shoes("척테일러", 11000);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
	}
}
