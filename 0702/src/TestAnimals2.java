
public class TestAnimals2 {
	public static void main(String[] args) {
//		Animal a = new Animal("동물", 2);
//		
//		Dog d = (Dog) a;   // 인스턴스 생성 타입 강아지 X, 실행 시 예외 발생
		
		Animal animal = new Dog("원래부터 강아지", 4);
		
		Dog dog = (Dog) animal;
		dog.bark();
		
//		Cat cat = (Cat) animal;
		
		System.out.println(animal instanceof Cat);
		System.out.println(animal instanceof Cat);
		
		System.out.println("프로그램 종료");
	}
}
