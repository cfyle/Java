import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestListCustomer {
	public static void main(String[] args) {
		File customerFile = new File("d:\\myfolder\\customer.txt");

		FileReader reader = null;
		StringBuilder sb = new StringBuilder();
		try {
			reader = new FileReader(customerFile);

			int ch;
			while ((ch = reader.read()) != -1) {
				sb.append((char) ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		String fileContent = sb.toString();
		System.out.println(fileContent);
		
		String[] split = fileContent.split("\n");
		System.out.println(split[0]);
		System.out.println(split[1]);
	}
}
