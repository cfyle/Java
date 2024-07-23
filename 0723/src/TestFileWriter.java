import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
	public static void main(String[] args) {
		File file = new File("d:\\myfolder\\datalog.txt");

		String topScore = "오늘 최고 기록: 180점";
//		char[] arr = topScore.toCharArray();
		// 문자 단위 출력 스트림
		FileWriter writer = null;
		try {
			writer = new FileWriter(file);
			
//			for (int i = 0; i < arr.length; i++) {
//				writer.write(arr[i]);
//			}
//			writer.write(arr, 0, arr.length);
//			writer.write(arr);
			writer.write(topScore);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
