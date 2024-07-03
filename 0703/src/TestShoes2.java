
public class TestShoes2 {
	public static void main(String[] args) {
		ShoesWithSize s1 = new ShoesWithSize("나이키 에어포스 1", 150000, 265);
		ShoesWithSize s2 = new ShoesWithSize("나이키 에어포스 1", 150000, 265);
		ShoesWithSize s3 = new ShoesWithSize("나이키 에어포스 1", 150000, 275);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}
