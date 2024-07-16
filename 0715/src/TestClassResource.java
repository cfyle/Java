import java.io.IOException;

import javax.imageio.ImageIO;

// Exception
// checked Exception (Exception 상속)

// unchecked Exception (RuntimeException 상속)

public class TestClassResource {
	public static void main(String[] args) {
		try {
			ImageIO.read(TestClassResource.class.getResource("그림파일.png"));
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("이미지를 읽다가 예외 발생");
		}
	}
}
