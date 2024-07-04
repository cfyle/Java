interface Minusable {
	int minus(int left, int right);
}


public interface Calculatable {
	
	
	// public abstarct int sum(int a, int);
	// public 을 생략해도 public
	//     abstract 를 빼도 추상메소드 (생략 가능)
	int sum(int a, int b);
}

class Calculator implements Calculatable, Minusable {

	@Override
	public int sum(int a, int b) {
		System.out.println("계산기가 계산을 합니다");
		return a + b;
	}

	@Override
	public int minus(int left, int right) {
		System.out.println("계산기가 마이너스 계산을 합니다");
		return left - right;
	}
	
	
}

class Computer implements Calculatable {

	@Override
	public int sum(int a, int b) {
		System.out.println("컴퓨터가 계산을 합니다");
		return a + b;
	}
	
	public int minus(int a, int b) {
		return a - b;
	}
	
}