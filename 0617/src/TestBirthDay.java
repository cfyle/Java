import java.time.LocalDate;

// 사람
// 이름 : String
// 생일 : LocalDate

// 모든 필드 생성자, getter, setter

class Friend {
	private String name;
	private LocalDate birthDay;
	public Friend(String name, LocalDate birthDay) {
		super();
		this.name = name;
		this.birthDay = birthDay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}
	
	// 사람은 자신의 생일까지 몇 일 남았는지 알려줄 수 있음 () : int
	public int getDday () {
		LocalDate now = LocalDate.now();
		LocalDate birthOfThisYear = LocalDate.of(now.getYear(), birthDay.getMonth(), birthDay.getDayOfMonth());
		
		return birthOfThisYear.getDayOfYear() - now.getDayOfYear();
	}
	
}


public class TestBirthDay {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2024, 5, 20);
		Friend friend = new Friend("판호", date);
		
		System.out.println(friend.getDday());
	}
}
