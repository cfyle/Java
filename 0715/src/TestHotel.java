import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.naming.OperationNotSupportedException;

// 호텔

// A사람, B사람

class A {
	private Person[] customers;

	public A() {
		customers = new Person[1];
	}

	public void add(Person p) {
		customers[0] = p;
	}

	public void printAll() {
		for (Person p : customers) {
			System.out.println(p);
		}
	}
	
	public void somethingNew() throws OperationNotSupportedException {
		throw new OperationNotSupportedException("아직 덜 만들었어요");
	}
	/**
	 * @exception 찾는 원소가 없을 때 발생합니다
	 */
	public Person find(String name) {
		Person find = null;
		for (Person p : customers) {
			if (p.getName().equals(name)) {
				find = p;
			}
		}
		throw new NoSuchElementException("해당 이름의 고객이 없습니다");
	}

}

class B {
	// 인적정보를 입력받음
	public Person input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("고객 이름을 입력하세요");
//		String neme = null;
		String name = scanner.nextLine();

		return new Person(name);
	}
}

class Person {
	private String name;

	public Person(String name) {
		super();
		if (name == null) {
			throw new IllegalArgumentException("고객 이름은 null일 수 없습니다");
		}
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
		return "사람 [이름 : " + name + "]";
	}

}

public class TestHotel {
	public static void main(String[] args) {
		B b = new B();
		A a = new A();

		Person input = b.input();
		a.add(input);
		a.printAll();

		String target = "";
		Person find;
		try {
			find = a.find(target);
			System.out.println(find);
			find.setName("ㅋㅋㅋ");
		} catch (Exception e) {
			System.out.println("찾고자 하는 이름의 고객이 없습니다");
		}
	}
}
