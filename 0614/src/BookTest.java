public class BookTest {
	public static void main(String[] args) {
		
		Book b = new Book("대부님", "최형배", 8000);
		Book anotherRef = b;
		
		anotherRef.setPrice(9000);
		
		System.out.println(anotherRef.getPrice());
		System.out.println(b.getPrice());
		
		
//		Book b = new Book("최사장님 와이라노", "김판호", 5000);
//		
//		System.out.println(b.title);
//		System.out.println(b.getTitle());
//		
//		System.out.println(b.writer);
//		System.out.println(b.getWriter());
//		
////		System.out.println(b.price);   // private 로 접근금지
//		System.out.println(b.getPrice());
//		b.setPrice(4444);
//		b.setPrice(-2000);
	}
}