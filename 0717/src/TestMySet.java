import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Cup {
	private int size;

	public Cup(int size) {
		super();
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "컵 [사이즈 : " + size + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(size);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Cup)) {
			return false;
		}
		Cup other = (Cup) obj;
		return size == other.size;
	}
	
	
}

public class TestMySet {
	public static void main(String[] args) {
		Set<Cup> cups = new HashSet<>();
		cups.add(new Cup(100));
		cups.add(new Cup(100));
		cups.add(new Cup(100));
		cups.add(new Cup(100));
		cups.add(new Cup(200));
		
		System.out.println(cups.size());
		System.out.println(cups.toString());
	}
}
