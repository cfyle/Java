import java.util.Objects;

public class ObjectHash {
	public static void main(String[] args) {
		System.out.println(Objects.hash(100));
		System.out.println(Objects.hash(100));
		System.out.println(Objects.hash(101));
		
		System.out.println(Objects.hash("문자열", 100));
		System.out.println(Objects.hash("문자열", 100));
		System.out.println(Objects.hash("문자열", 101));
		System.out.println(Objects.hash(100, "문자열"));
		
//		Object o = new Object();
//		System.out.println(o.hashCode());
//		
//		System.out.println(new Object().hashCode());
//		System.out.println(new Object().hashCode());
//		System.out.println(new Object().hashCode());
		
//		System.out.println(new Cup(100).hashCode());
//		System.out.println(new Cup(100).hashCode());
//		System.out.println(new Cup(100).hashCode());
//		
//		Cup c1 = new Cup(100);
//		Cup c2 = new Cup(100);
//		
//		System.out.println(c1.hashCode() == c2.hashCode());
//		System.out.println(c1.equals(c2));
	}
}
