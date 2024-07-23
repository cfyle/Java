import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {
	public static void main(String[] args) {
		int score = 180;

		File scoreFile = new File("d:\\myfolder\\score.bin");

		FileOutputStream output = null;

		try {
			output = new FileOutputStream(scoreFile);

			output.write(score);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(scoreFile);

			int value = fis.read();

			System.out.println("파일에서 읽은 정수값: " + value);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
