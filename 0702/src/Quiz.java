class SoundAnimal {
	protected int weight;

	public SoundAnimal(int weight) {
		super();
		this.weight = weight;
	}

	public void Fly() {
		System.out.println(weight + "kg의 몸뚱이를 이끌고 난다");
	}

	public void Sound() {
		System.out.println("동물 소리");
	}

}

// 독수리
// 체중
// 날 수 있음 : void {"난다" 콘솔출력 구현}
// 소리 낼 수 있음 : void {독수리 소리 콘솔출력 구현}
class Eagle extends SoundAnimal {

	public Eagle(int weight) {
		super(weight);
	}

	@Override
	public void Sound() {
		System.out.println("독수리는 짹짹짹");
	}

}

// 오리
// 체중
// 날 수 있음 : void { "난다" 콘솔출력 구현}
// 소리 낼 수 있음 : void { 오리 소리 콘솔출력 구현}

class Duck extends SoundAnimal {

	public Duck(int weight) {
		super(weight);
	}
	
	@Override
	public void Sound() {
		System.out.println("오리는 꽥꽥꽥");
	}
	
}

public class Quiz {
	public static void main(String[] args) {
		Eagle eagle = new Eagle(10);
		eagle.Fly();
		eagle.Sound();
		
		Duck duck = new Duck(5);
		duck.Fly();
		duck.Sound();
		
	}
}
