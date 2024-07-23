import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileRead {
	public static void main(String[] args) {
		File file = new File("d:\\myfolder\\new.txt");
		
		// 캐릭터(문자) 단위
		FileReader reader = null;
		try {
			reader = new FileReader(file);
			
			int ch;
			while ( (ch = reader.read()) != -1 ) {
				System.out.print((char) ch);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없어, 예외 발생");
		} catch (IOException e) {
			System.out.println("파일을 읽는 도중, 예외 발생");
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					System.out.println("자원 해제 중, 예외 발생");
				}
			}
		}
	}
}