// 캔음료
// 제품명 : String
// 가격 : int

// 모든 필드 생성자, getter / setter

// CanDrink 클래스 참조

public class TestRefArray6 {

	public static void main(String[] args) {
		// [ {콜라, 2000}, {사이다, 1800}, {환타, 1500} ]
		CanDrink[] drinks = new CanDrink[] {
				new CanDrink("콜라", 2000)
				, new CanDrink("사이다", 1800)
				, new CanDrink("환타", 1500)
				};
		for (int i = 0; i < drinks.length; i++) {
			System.out.println(drinks[i].getProductName());
		}
		
		System.out.println(drinks[0].getPrice());
		
	}
}
