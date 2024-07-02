
public class Author extends Person {
	String title;

	public Author(String name, int age, String title) {
		super(name, age);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
