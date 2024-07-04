import java.util.Objects;

interface AreaPrintable {
	void printArea();

}

public interface StatusPrintable {
	void printStatus();
}

interface Shape extends AreaPrintable, StatusPrintable {

}

// 상태를 출력가능하고, 면적을 구해 출력가능한 삼각형
class Triangle implements Shape {
	private int length;
	private int height;

	public Triangle(int length, int height) {
		super();
		this.length = length;
		this.height = height;
	}

	@Override
	public void printStatus() {
		System.out.println(this.toString());
		this.printArea();
	}

	@Override
	public void printArea() {
		System.out.println("면적 : " + length * height / 2);
	}

	@Override
	public String toString() {
		return "Triangle [length=" + length + ", height=" + height + "]";
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public int hashCode() {
		return Objects.hash(height, length);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Triangle)) {
			return false;
		}
		Triangle other = (Triangle) obj;
		return height == other.height && length == other.length;
	}

}

// 상태를 출력가능하고, 면적을 구해 출력가능한 사각형

class Person implements StatusPrintable {
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	@Override
	public void printStatus() {
		System.out.println(this.toString());
	}

}