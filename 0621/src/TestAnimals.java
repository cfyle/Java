import java.util.Arrays;

class Animal {
	private String type;
	private int age;
	private String ownerName;

	public Animal(String type, int age, String ownerName) {
		super();
		this.type = type;
		this.age = age;
		this.ownerName = ownerName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", age=" + age + ", ownerName=" + ownerName + "]";
	}

	
	
}

public class TestAnimals {
	public static void main(String[] args) {
		Animal[] animals = new Animal[] { new Animal("푸들", 3, "길동"), new Animal("셰퍼드", 5, "마이콜") };
		System.out.println(animals[0].toString());

		System.out.println(Arrays.toString(animals));
	}
}
