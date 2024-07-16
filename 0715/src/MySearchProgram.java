import java.util.NoSuchElementException;
import java.util.concurrent.ForkJoinPool;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class MySearchProgram {
	private int[] numbers;

	/**
	 * 정수 배열의 파라미터로 전달받는 생성자입니다
	 * @author 박주용
	 * @param numbers 원소를 찾고자 하는 배열
	 * @exception IllegalArgumentException 배열이 null 이거나 length가 0인 경우에 발생
	 */

	// 생성 시 인트 배열 객체가 널이 아니고 길이가 0 초과여야함
	public MySearchProgram(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			throw new IllegalArgumentException("배열에는 원소가 있어야 한다");
		}
		this.numbers = numbers;
	}

	/**
	 * 해당 원소의 인덱스를 찾을 수 있는 메소드입니다
	 * @param elem 찾고자 하는 원소값
	 * @return int 배열의 인덱스 값이 반환됩니다
	 * @exception NoSuchElementException 해당 원소와 동등한 값이 없는 경우 발생합니다
	 */

	public int findIndex(int elem) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == elem) {
				return i;
			}
		}
		throw new NoSuchElementException("해당 값을 가지는 원소가 존재하지 않습니다");
	}

	public static void main(String[] args) {
		MySearchProgram my = new MySearchProgram(new int[] { 10, 20, 30 });

		my.findIndex(10);
	}
}
