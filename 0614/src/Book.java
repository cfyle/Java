// 책
// 제목 : String
// 작가명 : String
// 가격 : int

// 모든 필드 초기화 생성자

//

public class Book {
	// 캡슐화
	// 접근 제한자 (Access Modifier)
	public String title;
	public String writer;
	private int price;

//	용사의 상태
//	int attack;         //관련있는 필드끼리 묶어놓는 것을 캡슐화
//	int defence;
//	int hp;
//	int mp;

	public Book(String title, String writer, int price) {
		this.title = title;
		this.writer = writer;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
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
