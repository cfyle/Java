import java.io.File;

public class TestFile {
	public static void main(String[] args) {
		// 하나 하나 경로를 찾아 오는 것을 '절대경로'
		
		// 파일은 경로를 가짐
		File file = new File("d:\\jy.txt");
		
		// 파일이 존재하는지 (있으면 true | 없으면 false)
		System.out.println("파일의 존재 유무 : " + file.exists());
		System.out.println("파일 이름 : " + file.getName());
		System.out.println("파일 경로 : " + file.getPath());
		System.out.println("폴더(디렉토리) 인가요? " + file.isDirectory());
		
		System.out.println("=================================");
		
		// 폴더도 가능
		File directory = new File("d:\\myfolder");
		System.out.println("파일의 존재 유무 : " + directory.exists());
		System.out.println("폴더 이름 : " + directory.getName());
		System.out.println("폴더 경로 : " + directory.getPath());
		System.out.println("폴더(디렉토리) 인가요? " + directory.isDirectory());
		
		System.out.println("=================================");
		
		File another = new File("d:\\myfolder\\new.txt");
		System.out.println("파일의 존재 유무 : " + another.exists());
	}
}
