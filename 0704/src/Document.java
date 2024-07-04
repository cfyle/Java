import java.util.Comparator;
import java.util.Objects;

// 문서 관리 프로그램

// 사용자가 콘솔 입력을 통해 사용할 수 있음.

// 문서: 작성자, 제목, 중요도, 내용

// 문서 등록
// 문서목록 (중요도 순, 제목 순(가나다))
// 문서 검색 및 조회

class ImportantComparator implements Comparator<Document> {

	@Override
	public int compare(Document o1, Document o2) {

		String front = o1.getImportant();
		String back = o2.getImportant();

		return front.compareTo(back);
	}
}

class TitleComparator implements Comparator<Document> {

	@Override
	public int compare(Document o1, Document o2) {
		String leftName = o1.getTitle();
		String rightName = o2.getTitle();

		return leftName.compareTo(rightName);
	}

}

public class Document implements Comparable<Document> {
	private String manager;
	private String title;
	private String important;
	private String content;
	int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Document(String manager, String title, String important, String content) {
		super();
		this.manager = manager;
		this.title = title;
		this.important = important;
		this.content = content;
	}

	@Override
	public int compareTo(Document o) {
		return 0;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImportant() {
		return important;
	}

	public void setImportant(String important) {
		this.important = important;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public int hashCode() {
		return Objects.hash(content, important, manager, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Document)) {
			return false;
		}
		Document other = (Document) obj;
		return Objects.equals(content, other.content) && Objects.equals(important, other.important)
				&& Objects.equals(manager, other.manager) && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "문서 [작성자 : " + manager + " | 제목 : " + title + " | 중요도 : " + important + " | 내용 : " + content + "]";
	}

}
