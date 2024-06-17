// 펜
// 모델명
// 가격

// 모든 필드 초기화 생성자, getter, setter

// 문자열을 콘솔 출력할 수 있음(String) : void
public class Pen {
	private String modelName;
	private int price;
	public Pen(String modelName, int price) {
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
	public void write(String line) {
		System.out.println("펜으로 [ " + line + " ] 을 적어냅니다");
	}
	
}
