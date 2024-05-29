public class Mod4 {
	public static void main(String[] args) {
		int money = 45000;
		
		// 위 금액을 지폐로 환산하여
		// 만원권, 천원권의 개수를 구해 출력하세요
		
		System.out.println("만원권 : " + (money / 10000) + "장");
		System.out.println("천원권 : " + (money % 10000 / 1000) + "장");
	}
}