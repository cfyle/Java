// 비행기
// 모델명 : String
// 최대승객수 : int

// 모든 필드를 초기화 하는 생성자 작성
public class Plane {
	
	String modelName;
	int maxPassenger;
	
	public Plane(String n, int p) {
		modelName = n;
		maxPassenger = p;
	}
	
	public void printState() {
		System.out.println(modelName);
		System.out.println(maxPassenger);
	}
	
	public static void main(String[] args) {
		Plane p = new Plane("B747", 400);
		Plane p2 = new Plane("A380", 500);
		
		p.printState();
		System.out.println("------------");
		p2.printState();
	}

}
