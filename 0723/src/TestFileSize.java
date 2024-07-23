import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestFileSize {
	public static void main(String[] args) {
		File file = new File("d:\\myfolder\\new.txt");

		// 파일의 크기를 바이트 단위로 알려줌
		System.out.println(file.length());

		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String nextLine = scanner.nextLine();
				System.out.println("파일에 기록된 문자열 한 줄 : " + nextLine);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않아서, 예외가 발생했습니다");
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}
