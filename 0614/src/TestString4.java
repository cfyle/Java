public class TestString4 {
	public static void main(String[] args) {
		String line = "This is a banana";
		
		int index = line.indexOf("T");
		System.out.println(index);
		
		System.out.println(line.indexOf("c"));  // 존재하지 않을때 -1 을 출력
		
		System.out.println(line.indexOf("a"));  // 같은 문자일 경우 제일 앞에 있는것을 출력
		System.out.println(line.indexOf("a", 9));
		
		System.out.println(line.lastIndexOf("a"));
	}
}
