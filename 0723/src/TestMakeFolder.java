import java.io.File;
import java.io.IOException;

public class TestMakeFolder {
	public static void main(String[] args) {
		File dateFolder = new File("d:\\myfolder");
		
		File helloFolder = new File(dateFolder, "hello");
		System.out.println(helloFolder.getPath());
		// 폴더 생성
		helloFolder.mkdir();
		
		boolean exists = helloFolder.exists();
		if (exists) {
			File file = new File(helloFolder, "World.txt");
			
			if (file.exists()) {
				try {
					// 파일 생성
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
