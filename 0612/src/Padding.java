// 패딩
// 제조사
// 모델명
// 가격
// 할인율
public class Padding {
	String Production;
	String modelName;
	int price;
	int saleRate;
	
	public double getSalePrice() {
		return price - (saleRate / 100.0) * price;
	}
	
	
	public static void main(String[] args) {
		Padding p = new Padding();
		p.Production = "무신사";
		p.modelName = "P0302";
		p.price = 100000;
		p.saleRate = 50;
		
		System.out.println(p.getSalePrice());
	}
}
