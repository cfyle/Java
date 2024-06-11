class Korean {
	String name;
	int age;
	
	public void introduce() {
		System.out.println("안녕하세요");
		System.out.println("제 이름은 " + name + " 입니다");
		System.out.println("제 나이는 " + age + "살 입니다");
		
	}
}
public class TestObject6 {
	public static void main(String[] args) {
		Korean panHo = new Korean();
		panHo.name = "김판호";
		panHo.age = 22;
		
		Korean haengBae = new Korean();
		haengBae.name = "최형배";
		haengBae.age = 33;
		
		panHo.introduce();
		haengBae.introduce();
		
		// 최익현, 17세 객체 생성 후, 자기소개 시켜보기(메소드 호출)
		Korean ikHyun = new Korean();
		ikHyun.name = "최익현";
		ikHyun.age = 17;
		
		ikHyun.introduce();
	}
}
