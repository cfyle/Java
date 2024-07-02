// 직원
// 이름, 나이, 직책

// 작가
// 이름, 나이, 대표작명

public class TestPersons2 {
	public static void main(String[] args) {
		Staff staff = new Staff("김판호", 23, "대리");
		staff.status();
		
		Author a = new Author("최형배", 33, "범죄와의전쟁");
		System.out.println(a.getName());
		System.out.println(a.title);
	}
}
