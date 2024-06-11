/*
 * 1. 영화의 클래스를 작성해보세요.
 * 	    제목, 감독이름, 개봉일을 상태로 가집니다.
 * 	    모든 상태값을 콘솔에 출력할 수 있는 동작을 가집니다.
 * 
 * 2. 위의 클래스로 인스턴스를 생성해서,
 *    상태 값을 초기화하고 메소드를 호출해 출력을 확인해보세요.
 * 
 * 3. 삼각형 클래스 작성 및 객체 테스트
 *    상태: 밑변, 높이
 *    기능: 넓이를 구해 콘솔 출력하는 기능
 *    
 * 4. 고양이 클래스 작성 및 객체 테스트
 *    상태: 이름, 나이, 성별
 *    기능: 모든 필드 콘솔 출력    
 *    
 */

public class Q {
	public static void main(String[] args) {
		Movie m = new Movie();
		
		m.title = "범죄와의 전쟁";
		m.directorName = "최익현";
		m.releaseDate = "2024년 6월 11일";
		
		System.out.println("영화제목 : " + m.title);
		System.out.println("감독 : " + m.directorName);
		System.out.println("개봉일 : " + m.releaseDate);
		
		System.out.print("관객 수 : ");
		m.Audience();
		
		
	}
}
