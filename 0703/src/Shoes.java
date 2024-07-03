import java.util.Objects;

// 모델명
// 현재가격

// 모든필드 생성자, getter/setter, toString
// 동등함 equals 재정의 (가격이 달라도 모델명이 같으면 동등한 신발)
public class Shoes {
	String modelName;
	int price;
	
	public Shoes(String modelName, int price) {
		super();
		this.modelName = modelName;
		this.price = price;
		
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(modelName, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Shoes)) {
			return false;
		}
		Shoes other = (Shoes) obj;
		return Objects.equals(modelName, other.modelName);
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
	
}
