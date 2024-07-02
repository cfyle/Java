// 사자
// 이름, 나이, 몸무게
// 고기를 먹을 수 있음

public class Lion extends Animal {
	private int weight;

	public Lion(String name, int age, int weight) {
		super(name, age);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override // 메소드 재정의 or 오버라이드   - 자식 클래스에서 새롭게 재정의 한것으로 호출
	public String toString() {
		return "사자의 몸무게 :" + weight + "kg";
	}
	
	public static void main(String[] args) {
		Lion i = new Lion("품바", 3, 500);
		
		System.out.println(i.getName());
		System.out.println(i.getAge());
		System.out.println(i.weight);
		System.out.println(i.toString());
	}
	
	
	

}
