// 강아지
// 이름, 나이
// 짖을 수 있음

// 고양이
// 이름, 나이
// 냐옹 할 수 있음

public class Animal {
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
