import java.io.File;

public class TestAbsFile {
	public static void main(String[] args) {
		File file = new File("없는 드라이브:\\없는폴더\\없는파일.없는확장자");
		
		// 파일이 없는 경우가 존재하기 때문에 exists 로 확인 필수
		System.out.println("실제 파일인가요? " + file.exists());
		System.out.println(file.getName());
		System.out.println(file.getPath());
	}
}
