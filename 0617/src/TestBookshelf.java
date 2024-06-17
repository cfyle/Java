// 책장 : Bookshelf
// 책 : Book
// 책 : Book
// 책 : Book
class Bookshelf {
	private Book book1;
	private Book book2;
	private Book book3;

	public Bookshelf() {
	}

	public Bookshelf(Book book1, Book book2, Book book3) {
		super();
		this.book1 = book1;
		this.book2 = book2;
		this.book3 = book3;
	}

	public Book getBook1() {
		return book1;
	}

	public void setBook1(Book book1) {
		this.book1 = book1;
	}

	public Book getBook2() {
		return book2;
	}

	public void setBook2(Book book2) {
		this.book2 = book2;
	}

	public Book getBook3() {
		return book3;
	}

	public void setBook3(Book book3) {
		this.book3 = book3;
	}

	// 책 반환 (int) : Book
	public Book getBook(int number) {
		if (number == 1) {
			return book1;
		} else if (number == 2) {
			return book2;
		} else if (number == 3) {
			return book3;
		} else {
			return null;
		}
	}

}

public class TestBookshelf {
	public static void main(String[] args) {
		Bookshelf bookshelf = new Bookshelf();
		System.out.println(bookshelf.getBook1());
		System.out.println(bookshelf.getBook2());
		System.out.println(bookshelf.getBook3());

		Author author = new Author("백희나", 25, "부산시 남구", "010-1234-5678");

		Book book = new Book("달샤베트", author, 15000);

		bookshelf.setBook2(book);

		System.out.println(bookshelf.getBook2().getTitle());
		System.out.println(bookshelf.getBook2().getAuthor().getName());

		System.out.println(author.getName());
		
		bookshelf.setBook1(book);
		bookshelf.setBook2(book);
		
		Book ref1 = bookshelf.getBook1();
		Book ref2 = bookshelf.getBook2();
		Book ref3 = bookshelf.getBook3();
		Book wrongRef = bookshelf.getBook(-5);
		
		System.out.println(ref1 == ref2);
		System.out.println(wrongRef);
	}
}