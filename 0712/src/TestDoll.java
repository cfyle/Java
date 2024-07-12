class Doll {
	private String modelName;
	private int price;

	public Doll(String modelName, int price) {
		super();
		this.modelName = modelName;
		this.price = price;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "인형 [제품명 : " + modelName + ", 가격 : " + price + "]";
	}

}

class DollFactory {
	public Doll createBarbie() {
		return new Doll("바비", 150000);

	}
}

class DollBuilder {
	private String modelName;
	private int price;

	public DollBuilder modelName(String modelName) {
		this.modelName = modelName;
		return this;
	}

	public DollBuilder price(int price) {
		this.price = price;
		return this;
	}
	
	public Doll build() {
		return new Doll(modelName, price);
	}
}

public class TestDoll {
	public static void main(String[] args) {
		Doll doll = new Doll("바비", 150000);

		DollFactory dollFactory = new DollFactory();
		Doll barbie = dollFactory.createBarbie();

		System.out.println(barbie);
		
		DollBuilder dollBuilder = new DollBuilder();
		dollBuilder.modelName("바비").price(150000);
		
		Doll anotherBarbie = dollBuilder.build();
		dollBuilder.price(100000);
		
		Doll sale = dollBuilder.build();
		
		System.out.println(anotherBarbie);
		System.out.println(sale);
	}
}
