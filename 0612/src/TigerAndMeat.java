class Tiger {
	// 고기를 먹음 -> 고기의 양이 1kg 줄어듬
	public void eat(Meat meat) {
		meat.kg--;
	}
}

class Meat {
	// 킬로그램
	int kg;
}
public class TigerAndMeat {
	public static void main(String[] args) {
		Tiger t = new Tiger();
		Meat m = new Meat();
		m.kg = 10;
		
		
		t.eat(m);
		t.eat(m);
		t.eat(m);
	}
}
