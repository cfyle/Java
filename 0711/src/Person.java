
public class Person {
	private String name;
	private int age;
	
	public Person() {
		
	}
	public Person(String name, int age) {
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
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("길동");
		p.setAge(23);
		
//		p.setName("길동").setAge(23);
		
		
	}
	
	
}
