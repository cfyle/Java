// 공원 : 상태 변경이 불가능한 객체로 구성
// 공원명
// 주소
// 면적

// 모든 필드를 private하게 선언
// 모든필드를 초기화 하는 생성자
// getter
public class Park {
	private String name;
	private String address;
	private int area;
	
	public Park(String name, String address, int area) {
		super();
		this.name = name;
		this.address = address;
		this.area = area;
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getArea() {
		return area;
	}
	
	
}
