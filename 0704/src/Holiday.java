import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;


class NameComparator implements Comparator<Holiday> {

	@Override
	public int compare(Holiday o1, Holiday o2) {
		String leftName = o1.getName();
		String rightName = o2.getName();
		
		return leftName.compareTo(rightName);
	}
	
}


public class Holiday implements Comparable<Holiday> {
	private String name;
	private LocalDate date;

	public Holiday(String name, LocalDate date) {
		super();
		this.name = name;
		this.date = date;
	}

	@Override
	public int compareTo(Holiday o) {
		return this.date.compareTo(o.date);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Holiday)) {
			return false;
		}
		Holiday other = (Holiday) obj;
		return Objects.equals(date, other.date) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Holiday [name=" + name + ", date=" + date + "]";
	}


}
