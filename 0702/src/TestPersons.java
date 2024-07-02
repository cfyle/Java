// 사람
// 이름, 나이
class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
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
	
}


// 학생
// 이름, 나이, 점수, 국영수 점수
// 총점을

class Student extends Person {
	private int kor;
	private int eng;
	private int math;
	
	public Student(String name, int age, int kor, int eng, int math) {
		super(name, age); // 언제나 첫 문장
//		this.name = name;
//		this.age = age;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getSum() {
		return kor + eng + math;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	
	
}


// 고객
// 이름, 나이, 전화번호
class Customer extends Person {
	String phoneNumber;
	
	public Customer(String name, int age, String phoneNumber) {
		super(name, age);
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}




public class TestPersons {
	public static void main(String[] args) {
		Student s = new Student("김판호", 20, 50, 60, 70);
		System.out.println(s.getSum());
		
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getKor());
		
		Customer c = new Customer("최익현", 22, "010-1234-1234");
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.getPhoneNumber());
		
		Person p = new Person("최형배", 24);
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}
}
