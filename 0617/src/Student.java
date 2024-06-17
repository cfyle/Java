// 학생
// 이름 : String
// 점수 : int
// 펜 : Pen

// 모든 필드 촉리화 생성자, getter, setter

// 자신의 이름을 콘솔 출력할 수 있음() : void
public class Student {
	private String name;
	private int score;
	private Pen pen;

	public Student(String name, int score, Pen pen) {
		super();
		this.name = name;
		this.score = score;
		this.pen = pen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}
	
	public void writeName() {
		pen.write(name);
	}

}
