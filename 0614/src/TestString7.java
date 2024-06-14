public class TestString7 {
	public static void main(String[] args) {
		String line = "you is a boy";
		
		System.out.println(line.replace("is", "are"));
		
		String result = line.replace("is", "are");
		
		System.out.println(result);
		
		String hello = "hello";
		String concat = hello.concat(" World");
		
		System.out.println(concat);
	}
}
