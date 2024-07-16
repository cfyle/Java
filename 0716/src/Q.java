import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

// 1. 사용자가 3 줄의 문자열을 입력합니다

// 세상의 모서리 구부정하게
// 커버린 골칫거리 Outsider
// 걸음걸이 옷차림 이어폰 너머

// 1-1. 띄어쓰기를 기준으로 총 몇 단어가 입력되었는지 출력
// 1-2. 띄어쓰기를 제외한 총 문자 개수 출력
// 1-3. 위 단어들을 역순으로 출력

// String.split 메소드의 문서 내용을 확인하고 활용해보기 or StringTokenizer class 활용해보기

// 2. 일기 관리 프로그램
// 2-1. 일기 작성
// - 일자, 날씨, 제목, 내용
// (동일한 일자에 대해서, 기존의 일기가 사라짐)
//
// 2-2. 일기 목록 보기
// - 일자순 제목 보기
// - 날씨로 검색하여 제목 보기
//
// 2-3. 특정 일자의 일기 내용 보기

public class Q {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("세상의 모서리 구부정하게", "커버린 골칫거리 Outsider", "걸음걸이 옷차림 이어폰 너머"));

		list.add("세상의 모서리 구부정하게");
		list.add("커버린 골칫거리 Outsider");
		list.add("걸음걸이 옷차림 이어폰 너머");

		int findSpace1 = list.get(0).indexOf(" ");
		int findSpace2 = list.get(1).indexOf(" ");
		int findSpace3 = list.get(2).indexOf(" ");
		System.out.println(findSpace3);

		int findTwoSpace = list.get(2).indexOf(" ", list.get(2).indexOf(" ") + 1);
		System.out.println(findTwoSpace);

		int findLastSpace1 = list.get(0).lastIndexOf(" ");
		int findLastSpace2 = list.get(1).lastIndexOf(" ");
		int findLastSpace3 = list.get(2).lastIndexOf(" ");
		System.out.println(findLastSpace3);

		//
		System.out.println("첫번째 문자열 띄어쓰기 사이에 단어 수는 : " + ((findLastSpace1 - findSpace1) - 1) + "개");
		System.out.println("두번째 문자열 띄어쓰기 사이에 단어 수는 : " + ((findLastSpace2 - findSpace2) - 1) + "개");
		System.out.println("세번째 문자열 첫번째 띄어쓰기와 두번째 띄어쓰기 사이의 단어 수는 : " + ((findTwoSpace - findSpace3) - 1) + "개");
		System.out.println("세번째 문자열 두번째 띄어쓰기와 세번째 띄어쓰기 사이의 단어 수는 : " + ((findLastSpace3 - findTwoSpace) - 1) + "개");

		System.out.println("====================================================");

		int count1 = 0;
		int count2 = 0;
		int count3 = 0;

		for (int i = 0; i < list.get(0).length(); i++) {
			if (list.get(0).charAt(i) == ' ') {
				count1++;
			}
		}

		for (int i = 0; i < list.get(1).length(); i++) {
			if (list.get(1).charAt(i) == ' ') {
				count2++;
			}
		}

		for (int i = 0; i < list.get(2).length(); i++) {
			if (list.get(2).charAt(i) == ' ') {
				count3++;
			}
		}
	
		
		
		
		System.out.println("첫번째 띄어쓰기를 제외한 총 문자 갯수는 : " + (list.get(0).length() - count1 + "개"));
		System.out.println("첫번째 띄어쓰기를 제외한 총 문자 갯수는 : " + (list.get(1).length() - count2 + "개"));
		System.out.println("첫번째 띄어쓰기를 제외한 총 문자 갯수는 : " + (list.get(2).length() - count3 + "개"));

		System.out.println("====================================================");
		
		System.out.println(list.get(0).lastIndexOf(" "));
		for (int i = 0; i < list.get(0).length(); i++) {
			list.get(0).lastIndexOf(" ");
		}
		
		
		
		
//		String[] split = "가나다 라마바 사아자".split(" ");
//		System.out.println(Arrays.toString(split));
	}
}

