import java.util.Arrays;
import java.util.Comparator;

class PersonWeightComparator implements Comparator<Person> {
	private static PersonWeightComparator instance = new PersonWeightComparator();
	
	public static PersonWeightComparator getInstance() {
		return instance;
	}
	
	private PersonWeightComparator() {

	}

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getWeight() - o2.getWeight();
	}
}

class Person implements Comparable<Person> {
	private int height;
	private int weight;

	public Person(int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public int compareTo(Person o) {
		return height - o.height;
	}
}

public class TestSortPerson {
	public static void main(String[] args) {
		Person[] arr = new Person[] { new Person(180, 80), new Person(190, 79), new Person(160, 75) };

		Arrays.sort(arr);

		Arrays.sort(arr, PersonWeightComparator.getInstance());

		// ...

		Arrays.sort(arr, PersonWeightComparator.getInstance());
	}
}