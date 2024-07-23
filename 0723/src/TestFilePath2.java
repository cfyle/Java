import java.io.File;
import java.io.IOException;

public class TestFilePath2 {
	public static void main(String[] args) {
		File file = new File("D:\\juyong\\workspace\\0723\\myfile.txt");
		
		System.out.println("부모 경로 명 : " + file.getParent());
		
		File parent = file.getParentFile();
		System.out.println(parent.getPath());
		
		File workspace = parent.getParentFile();
		System.out.println(workspace.getPath());
		
		// 상대 경로 상위(부모) 경로
		File currentFolder = new File(".");
		File parentFolder = new File("..");
		try {
			System.out.println("상위 경로의 절대 경로 : " + parentFolder.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File parentparentFolder = new File("..\\..");
		try {
			System.out.println(parentparentFolder.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
