// 책
// 제목 : String
// 작가명 : String
// 가격 : int

// 모든 필드 초기화 생성자

//

public class Book {
	// 캡슐화
	// 접근 제한자 (Access Modifier)
	private String title;
	private Author author;   // has - a 관계
	private int price;


//	용사의 상태
//	int attack;         //관련있는 필드끼리 묶어놓는 것을 캡슐화
//	int defence;
//	int hp;
//	int mp;

	public Book(String title, Author author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}
	
	public void setAuthor(Author author) {
		this.author = author;
	}


	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price > 0) {
			this.price = price;
		}
	}

	public static void main(String[] args) {
		
	}
}