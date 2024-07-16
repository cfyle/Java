import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

class Person {
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
	public String toString() {
		return "Person [name=" + name + "]";
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
	
	

}

public class TestPersonList {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		Person person = (new Person("길동"));
		
		list.add(person);
		list.add(person);
		list.add(person);
		list.add(person);
		list.add(person);
		person.setName("둘리");
		
		System.out.println(list.size());

		for (Person p : list) {
			System.out.println(p.getName());
		}

		Iterator<Person> iterator = list.iterator();
		while (iterator.hasNext()) {
			Person p = iterator.next();

			System.out.println(p.getName());
		}
	}
}