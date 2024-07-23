import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// 1. 학생 정보를 입력받아, 다음과 같은 포맷의 정보로 저장하는 프로그램을 작성하세요

// 한 번 실행 => 한 학생 콘솔 입력

// 이름, 국어, 영어, 수학
// 둘리, 100, 100, 100 // 사용자의 입력값
// 도우너, 90, 90, 90
// 길동, 80, 80, 80

// ---

// 2. 위 파일의 정보를 읽어, 모든 점수의 합을 출력하는 프로그램

// ---

// 1. Java에서 Windows File-System에 기록되어 있는 파일 경로를 나타낼 때, 경로 구분자 '문자'는?
// 1-1. 상대적 경로를 나타내는 '.', '..', '\' 문자의 의미는 무엇인가요?
// 2. File 객체는 File-System에 꼭 존재해야만 생성가능한가요?
// 3. File 객체로 Folder(Directory)를 접근할 수 있나요?
// 4. File 객체로 실제 파일의 데이터 크기를 알아보는 방법과 단위는 무엇인가요?

// 5. Input/Output Stream
// 5-1. 입력 소스에서 데이터를 입력받는 흐름을 입력 스트림이라고 합니다.
// 5-2. 출력 대상으로 데이터를 출력하는 흐름을 출력 스트림이라고 합니다.
// 5-3. I/O Stream은 입출력하는 단위에 따라 Byte 스트림, Character 스트림으로 나뉩니다.
// 5-4. 그렇다면 Text-File의 정보를 읽기 위해 적합한 형태의 스트림은 무엇인가요?
// 5-5. 디스크 직접 접근은 비교적 비용이 많이 드는 작업입니다. 효율성을 크게 증가시키기 위해 사용할 수 있는 스트림은?
// 5-6. I/O 스트림은 '순차적 접근'의 특징을 가집니다.
// 5-7. I/O 스트림을 사용 후, 더 이상 필요하지 않는 스트림은 어떤 동작을 호출해야하나요?
class sumView {
	int sum;
	
	public sumView(int sum) {
		super();
		this.sum = sum;
	}
	
	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int sumScore() {
		return 0;
	}
}


public class Q {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생의 이름을 입력하세요");
		String name = scanner.next();

		System.out.println("국어 점수를 입력하세요");
		int kor = scanner.nextInt();

		System.out.println("영어 점수를 입력하세요");
		int eng = scanner.nextInt();

		System.out.println("수학 점수를 입력하세요");
		int math = scanner.nextInt();

		File studentScore = new File("d:\\myfolder\\student.txt");
		FileWriter writer = null;
		try {
			writer = new FileWriter(studentScore, true);

			writer.write("이름 : " + name + "\n");
			writer.write("국어 점수 : " + kor + "\n");
			writer.write("영어점수 : " + eng + "\n");
			writer.write("수학 점수 : " + math + "\n");
			writer.write("===============\n");

			System.out.println("학생 정보를 기록했습니다");
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

		File studentFile = new File("d:\\myfolder\\student.txt");

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(studentFile));

			String line;
			while ((line = br.readLine()) != null) {
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