import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MyProgram {
	private String value;

	public MyProgram(String value) {
		if (value == null || value.length() == 0) {
			throw new RuntimeException("문자열이 null 이거나 length가 0이라 생성할 수 없습니다");
		}
		this.value = value;
	}
	
	public void accessFile() throws FileNotFoundException {
		new FileInputStream(value);
	}
	
	public static void main(String[] args) {
		MyProgram my = new MyProgram("파일이름");
		
		try {
			my.accessFile();
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일을 찾을 수 없습니다");
		}
		
		try {
			ImageIO.read(new File("이미지.png"));
		} catch (IOException e) {
			System.out.println("이미지 입출력 중 예외 발생");
		}
	}
}
