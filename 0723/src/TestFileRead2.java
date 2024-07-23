import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileRead2 {
	public static void main(String[] args) {
		File file = new File("d:\\myfolder\\new.txt");
		
		// Byte(바이트) 단위
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);
			
			int ch;
			while ( (ch = inputStream.read()) != -1 ) {
				System.out.print((char) ch);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없어, 예외 발생");
		} catch (IOException e) {
			System.out.println("파일을 읽는 도중, 예외 발생");
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					System.out.println("자원 해제 중, 예외 발생");
				}
			}
		}
	}
}