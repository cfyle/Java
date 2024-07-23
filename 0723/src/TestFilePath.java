import java.io.File;
import java.io.IOException;

public class TestFilePath {
	public static void main(String[] args) {
		// 파일의 속성에서 위치 확인 가능
		File file = new File("D:\\juyong\\workspace\\0723\\myfile.txt");
		System.out.println(file.exists());
		
		// 상대 경로 relative path
		File sameFile = new File(".\\myfile.txt"); // . 은 작업하는 현재 경로를 의미
		System.out.println(sameFile.exists());
		System.out.println(sameFile.getPath());
		System.out.println(sameFile.getAbsolutePath()); // 실제 경로 표시
		
		try {
			System.out.println(sameFile.getCanonicalPath());
		} catch (IOException e) {
			System.out.println("절대 경로 표현으로 변환중 IO 예외가 발생했습니다");
		}
	}
}
