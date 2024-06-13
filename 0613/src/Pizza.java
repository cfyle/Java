/*
 *   피자 클래스
 *   - 상태
 *   메뉴명
 *   가격
 *   제조일자
 *   요리사 이름
 *   
 *   -
 *   모든 필드를 초기화 하는 생성자
 * 
 *   -
 *   각 필드의 getter / setter 쌍
 *   
 *   -
 *   위 피자 클래스로 페퍼로니, 치즈, 하와이안 피자 인스턴스를 생성해 테스트해보세요.
 * 
 */


public class Pizza {
	String menu;
	int price;
	String date;
	String chef;
	
	public Pizza() {
	
	}
	
	public Pizza(String menu, int price, String date, String chef) {
		this.menu = menu;
		this.price = price;
		this.date = date;
		this.chef = chef;
	}
	
	public Pizza(String menu) {
		this(menu, 0, null, null);
		System.out.println("뭔데이게 ㅅㅂ");
	}
	
	public String getMenu() {
		return menu;
	}
	
	public int getPirce() {
		return price;
	}
	
	public String getDate() {
		return date;
	}
	
	public String getChef() {
		return chef;
	}
	
	public void setMenu(String menu) {
		this.menu = menu;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public void setChef(String chef) {
		this.chef = chef;
	}
	
	public void printPizza() {
		System.out.println("메뉴 : " + this.menu);
		System.out.println("가격 : " + this.price + "원");
		System.out.println("제조일자 : " + this.date);
		System.out.println("셰프 이름 : " + this.chef);
		System.out.println("===================");
	}
	
	public static void main(String[] args) {
		Pizza p = new Pizza("페페로니", 20000, "2024-06-13", "김판호");
		p.printPizza();
		
		Pizza p2 = new Pizza("치즈피자", 10000, "2024-06-12", "최형배");
		p2.printPizza();
		
		Pizza p3 = new Pizza("하와이안 피자", 10, "1999-12-31", "최익현");
		p3.printPizza();
		
		p.setMenu("고구마 피자");
		System.out.println(p.getMenu());
		p.printPizza();
		
		Pizza p4 = new Pizza("불고기피자");
		p4.printPizza();
		
	}
}


/*
* 1. 인스턴시 생성 시, 필드 초기화를 위해 호출하는 것? 생성자, 필드의 초기화를 위해 자동 생성됨
* 2. 생성자의 네이밍 규칙? 클래스와 이름이 동일해야됨(자바)
* 3. 기본 생성자란? 매개 변수(파라미터)를 따로 받지 않는 생성자, 따로 설정하지 않으면 자동으로 생성됨
* 4. 기본형 타입, 참조형 타입의 기본값은? 기본형(int : 0, double : 0, long : 0L. ..), 참조형(String : Null...) 
* 5. 기본 생성자가 컴파일러에 의해 자동 생성되지 않는 경우는? 다른 생성자를 따로 작성하였을 때 
* 6. 파라미터를 달리하는 생성자를 여러 개 정의할 때, 컴파일러가 중복으로 판별하는 규칙은? 파라미터의 타입과 순서를 통해 구분
* 7. this? 현재 메서드가 속해 있는 객체 자신을 가리키는 참조
* 8. 생성자 내부에서 자신의 생성자를 호출할 때, 주의해야 할 점? this 구문은 반드시 첫줄에 위치
* 9. 접근자(getter), 설정자(setter)는 무엇인가요? getter : 멤버 변수(필드)를 반환하는 함수, setter : 멤버 변수를 변경하는 함수
*/
