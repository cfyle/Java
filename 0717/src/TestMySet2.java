import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Book {
	private String title;
	private int price;
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Book)) {
			return false;
		}
		Book other = (Book) obj;
		return price == other.price && Objects.equals(title, other.title);
	}
	@Override
	public int hashCode() {
		return Objects.hash(price, title);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "책 [제목 : " + title + ", 가격 : " + price + "]";
	}
	
}

public class TestMySet2 {
	public static void main(String[] args) {
		Set<Book> set = new HashSet<>();
		set.add(new Book("제목1", 10000));
		set.add(new Book("제목1", 10000));
		set.add(new Book("제목1", 10000));
		
		System.out.println(set);
	}
}
