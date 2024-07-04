import java.util.Arrays;
import java.util.Scanner;

// 문서 관리 프로그램

// 사용자가 콘솔 입력을 통해 사용할 수 있음.

// 문서: 작성자, 제목, 중요도, 내용

// 문서 등록
// 문서목록 (중요도 순, 제목 순(가나다))
// 문서 검색 및 조회

// class 문서
//
// interface 문서관리자 {
//		void 문서등록하기(문서 등록할문서);
//		void 문서목록보기();



public class Q {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Document[] documents = new Document[] {
				new Document("손흥민", "감아차기", "☆☆☆★★", "감아차기 기술 연마"),
				new Document("이재민", "연애의 정석", "☆★★★★", "Love Story"),
				new Document("막둥이", "철권 못하는 법", "☆☆★★★", "철권 못하는 101가지 방법"), 
				new Document("박주용", "점심시간", "☆☆☆☆★", "밥 맛있게 먹는법")
		};

		System.out.println("===제목 순서(가나다)===");
		Arrays.sort(documents, new TitleComparator());		
		for(Document d : documents) {
			System.out.println(d);
		}
		
		
		
		
		
	}
}
