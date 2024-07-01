package HotelDance;

// 최초 객실당 필요한 정보 클래스
public class Body {
	int roomNum; // 객실 번호
	int roomState; // 객실 상태 (0 : 빈 방, 1 : 예약중, 2 : 투숙중, 3 : 청소중)
	String name; // 고객 이름
	String phoneNumber; // 고객 전화번호
	String birth; // 고객 생년월일
	int rv; // 예약 번호
	Service service;

	// 생성자
	public Body(int roomNum, 
			int roomState,
			String name, 
			String phoneNumber, String birth, int rv, Service service) {
		super();
		this.roomNum = roomNum;
		this.roomState = roomState;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birth = birth;
		this.rv = rv;
		this.service = service;
	}

	public Body() {

	}

	// getter setter
	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	public int getRoomState() {
		return roomState;
	}

	public void setRoomState(int roomState) {
		this.roomState = roomState;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getRv() {
		return rv;
	}

	public void setRv(int rv) {
		this.rv = rv;
	}
}