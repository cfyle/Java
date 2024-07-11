class Student implements Cloneable {
	private int score;
	private Pen pen;

	public Student(int score, Pen pen) {
		super();
		this.score = score;
		this.pen = pen;
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

	@Override
	public String toString() {
		return "Student [score=" + score + ", pen=" + pen + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Student(score, new Pen(pen.getPrice()));
	}

	public Object cloneDeep() {
		return new Student(score, new Pen(pen.getPrice()));
	}

}

class Pen implements Cloneable {
	private int price;

	public Pen(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pen [price=" + price + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

public class TestClone {
	public static void main(String[] args) {
		Student kildong = new Student(100, new Pen(1000));
		Student dooli = new Student(100, new Pen(2000));
		Student kildong2 = kildong;
		// Shallow Copy
		Student kildong3 = new Student(kildong.getScore(), kildong.getPen());

		Student kildong4 = new Student(kildong.getScore(), new Pen(kildong.getPen().getPrice()));

		kildong.setScore(80);
		kildong.getPen().setPrice(500);

		System.out.println(kildong.toString());
		System.out.println(kildong2.toString());
		System.out.println(kildong3.toString());

	}

}
