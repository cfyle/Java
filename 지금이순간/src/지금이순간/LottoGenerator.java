package 지금이순간;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoGenerator {

	public static void main(String[] args) {
		// 로또 번호를 저장할 Set 객체 생성
		Set<Integer> lottoNumbers = new TreeSet<>();
		Random random = new Random();

		// 6개의 고유한 번호를 생성
		while (lottoNumbers.size() < 6) {
			int number = random.nextInt(45) + 1; // 1부터 45까지의 랜덤 숫자 생성
			lottoNumbers.add(number); // Set은 중복된 값을 허용하지 않음
		}

		// 결과 출력
		System.out.println("로또 번호: " + lottoNumbers);

	}
}