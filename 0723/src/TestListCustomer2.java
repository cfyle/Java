import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestListCustomer2 {
	public static void main(String[] args) {
		File customerFile = new File("d:\\myfolder\\customer.txt");
		
		BufferedReader br = null;
		try {
		br = new BufferedReader(new FileReader(customerFile));
		
		String line;
		while ( (line = br.readLine()) != null) {
			System.out.println(line);
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
