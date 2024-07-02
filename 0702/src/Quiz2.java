
// 일반적인 책 Book 클래스 작성. 제목, 페이지수, 저자 등. 생성자, getter/setter
// 잡지 Magazine 클래스. 추가로 발매일 정보
// 보이스북 VoiceBook 클래스. 추가로 녹음성우명 정보
// 위의 클래스로 인스턴스를 생성해보고 테스트한 후,
// 책장 BookShelf 클래스를 작성
// - (여러 책 인스턴스를 가지는 클래스)
// - 보관된 총 책 개수를 반환하는 메소드 : int

class Book {
	protected String title;
	protected int page;
	protected String Writer;

	public Book(String title, int page, String writer) {
		super();
		this.title = title;
		this.page = page;
		Writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getWriter() {
		return Writer;
	}

	public void setWriter(String writer) {
		Writer = writer;
	}
	
	public void print() {
		System.out.println(title + " | " + page + " | " + Writer);
	}

}

class Magazine extends Book {
	String releaseDate;

	public Magazine(String title, int page, String writer, String releaseDate) {
		super(title, page, writer);
		this.releaseDate = releaseDate;
	}

	public Magazine(String title, int page, String writer) {
		super(title, page, writer);
	}

	public void releaseDate() {
		System.out.println(title + "의 발매일은 : " + releaseDate + " 입니다");
	}

}

class VoiceBook extends Magazine {
	String voiceActor;

	public VoiceBook(String title, int page, String writer, String releaseDate, String voiceActor) {
		super(title, page, writer, releaseDate);
		this.voiceActor = voiceActor;
	}

	public VoiceBook(String title, int page, String writer) {
		super(title, page, writer);
	}

	public void voiceActor() {
		System.out.println("목소리 출연 " + voiceActor);
	}

}

class BookShelf {

	Book[] book = new Book[] { new Magazine("범죄와의 전쟁", 200, "김판호", "2012.02.02."),
			new Magazine("말죽거리잔혹사", 190, "권상우", "2004.01.16."), new Magazine("타짜", 320, "고니", "2006.09.28."),
			new VoiceBook("귀여운 새끼 미어캣들이 어른들한테 배우는 사막 생존 방법!", 100, "내셔널지오그래픽", "2019.07.15", "김숙자"),
			new VoiceBook("빵빵이의 일상", 90, "이주용", "2024.01.30.", "빵빵이"),
			new VoiceBook("zd의 달인", 25, "손흥민", "1992.07.08.", "우리흥") };
}

public class Quiz2 {
	public static void main(String[] args) {
		BookShelf bookshelf = new BookShelf();

		for (int i = 0; i < bookshelf.book.length; i++) {
			bookshelf.book[i].print();
		}

	}
}
