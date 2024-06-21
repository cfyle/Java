import java.util.Arrays;
import java.util.Scanner;

// 사용자가 입력한 문자열
// 문자의 알파벳 순서대로 출력해보기

// hello => ehllo

public class TestSort4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("영단어 입력");
		String word = s.next();
		char[] charArray = word.toCharArray();
		Arrays.sort(charArray);
		System.out.println(Arrays.toString(charArray));
		
		
		
//		String[] alphabet = { "h", "e", "l", "l", "o"};
//		
//		Arrays.sort(alphabet);
//		
//		System.out.println(Arrays.toString(alphabet));
	}
}
