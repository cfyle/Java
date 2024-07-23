import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestWriteCustomerInfo {
	public static void main(String[] args) {
		// 호텔의 예약을 하는 고객명과 전화버호를 파일로 기록하고자 함
		Scanner scanner = new Scanner(System.in);
		System.out.println("고객 이름은?");
		String name = scanner.next();
		
		System.out.println("고객 전화번호는?");
		String phoneNumber = scanner.next();
		
		File customerFile = new File("d:\\myfolder\\customer.txt");
		FileWriter writer = null;
		try {
			// FileWriter 는 기존 기록을 삭제하고 새로운 기록으로 덮어씀
//			writer = new FileWriter(customerFile);
			
			// 뒤에 true 값을 주면 계속 기록 보관
			writer = new FileWriter(customerFile, true);
			
			writer.write(name);
			writer.write("\n");
			writer.write(phoneNumber);
			writer.write("\n");
			
			System.out.println("파일에 고객정보를 기록했습니다. 확인해보세요");
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
