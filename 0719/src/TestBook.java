
public class TestBook {
	public static void main(String[] args) {
		Book b = new Book("책 제목1", 20000);
		
		b.setTitle("새 제목 2");
		
		System.out.println(b.getTitle());
		System.out.println(b.getPrice());
		
		System.out.println(b.toString());
		System.out.println(b.equals(new Book("새 제목 2", 20000)));
	}
}
