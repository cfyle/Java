class Tourlist {
	protected String name;

	public Tourlist(String name) {
		super();
		this.name = name;
	}

	public void sayHello() {
		System.out.println("-- 관광객이 인사를 합니다 --");
	}
}

// 한국말로 인사를 할 수 있는 관광객
// 이름 : String
// 인사하기 : void

class KoreanTourlist extends Tourlist {

	public KoreanTourlist(String name) {
		super(name);
	}

	@Override
	public void sayHello() {
		System.out.println("안녕하세요. 제 이름은 " + name + " 입니다");
	}

}

// 영어로 인사를 할 수 있는 관광객
// 이름 : String
// 인사하기 : void

class EnglishTourlist extends Tourlist {

	public EnglishTourlist(String name) {
		super(name);
	}

	@Override
	public void sayHello() {
		System.out.println("Hello. I'm " + name);
	}

}

public class TestTourlist {
	public static void main(String[] args) {
		Tourlist[] tourlist = new Tourlist[] { new KoreanTourlist("김판호"), new EnglishTourlist("Haengbae"),
				new KoreanTourlist("최익현"), new EnglishTourlist("Seojang") };

		for (int i = 0; i < tourlist.length; i++) {
			tourlist[i].sayHello();
		}

	}

}
