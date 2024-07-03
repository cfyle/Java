// 스마트기기
// 제조사명
// 가격
abstract class SmartMachine {
	String makeCompany;
	int price;

	public SmartMachine(String makeCompany, int price) {
		super();
		this.makeCompany = makeCompany;
		this.price = price;
	}

	public String getMakeCompany() {
		return makeCompany;
	}

	public void setMakeCompany(String makeCompany) {
		this.makeCompany = makeCompany;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

// 통화가 가능한 스마트기기
// 통신사명
// 통화하기
class PossibleCallSmartMachine extends SmartMachine {
	String carrier;
	boolean call;

	public PossibleCallSmartMachine(String makeCompany, int price, String carrier, boolean call) {
		super(makeCompany, price);
		this.carrier = carrier;
		this.call = call;
	}

	@Override
	public String getMakeCompany() {
		return super.getMakeCompany();
	}

	@Override
	public void setMakeCompany(String makeCompany) {
		super.setMakeCompany(makeCompany);
	}

	@Override
	public int getPrice() {
		return super.getPrice();
	}

	@Override
	public void setPrice(int price) {
		super.setPrice(price);
	}

}

// 아이폰 (통화가 가능한 스마트기기)
// 모델명
class Iphone extends PossibleCallSmartMachine {
	String modelName;

	public Iphone(String makeCompany, int price, String carrier, boolean call, String modelName) {
		super(makeCompany, price, carrier, call);
		this.modelName = modelName;
	}

	@Override
	public String getMakeCompany() {
		return super.getMakeCompany();
	}

	@Override
	public void setMakeCompany(String makeCompany) {
		super.setMakeCompany(makeCompany);
	}

	@Override
	public int getPrice() {
		return super.getPrice();
	}

	@Override
	public void setPrice(int price) {
		super.setPrice(price);
	}

}

// 아이패드with Usim (통화가 가능한 스마트기기)
// 디스플레이 크기
class IpadWithUsim extends PossibleCallSmartMachine {
	int size;

	public IpadWithUsim(String makeCompany, int price, String carrier, boolean call, int size) {
		super(makeCompany, price, carrier, call);
		this.size = size;
	}

	@Override
	public String getMakeCompany() {
		return super.getMakeCompany();
	}

	@Override
	public void setMakeCompany(String makeCompany) {
		super.setMakeCompany(makeCompany);
	}

	@Override
	public int getPrice() {
		return super.getPrice();
	}

	@Override
	public void setPrice(int price) {
		super.setPrice(price);
	}

}

// 아이패드 (유심이 없어서 통화가 불가능한 스마트기기)
// 디스플레이 크기
class Ipad extends SmartMachine {
	int size;

	public Ipad(String makeCompany, int price, int size) {
		super(makeCompany, price);
		this.size = size;
	}

	@Override
	public String getMakeCompany() {
		return super.getMakeCompany();
	}

	@Override
	public void setMakeCompany(String makeCompany) {
		super.setMakeCompany(makeCompany);
	}

	@Override
	public int getPrice() {
		return super.getPrice();
	}

	@Override
	public void setPrice(int price) {
		super.setPrice(price);
	}

}

// 다이얼 전화기 (통화가 가능한 아날로그 기기)
// 다이얼 직경
class DialPhone {
	int size;

}


public class TestSmartDevice {
	public static void main(String[] args) {
		Iphone iphone1 = new Iphone("애플", 1500000, "SK텔레콤", true, "아이폰 프로 15");
		System.out.println(iphone1.price);
		
		SmartMachine ipad1 = new Ipad("애플", 500000, 11);
		System.out.println(ipad1.price);
		
		iphone1.setPrice(1400000);
		
		System.out.println(iphone1.price);
		
		System.out.println("통화 가능 여부 : " + iphone1.call);
		
		
		
		

	}

}
