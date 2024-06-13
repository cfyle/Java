// 모든 필드를 초기화 하는 생성자 작성
// 각 필드의 getter / setter 쌍

public class Can {
	String name;
	int price;
	
	public Can(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public static void main(String[] args) {
		Can c1 = new Can("콜라", 1000); // name은 참조형 변수의 기본값인 null로 초기화됨
		
		System.out.println(c1.name);
		System.out.println(c1.price);
		
	}
}
