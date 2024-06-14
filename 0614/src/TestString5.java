public class TestString5 {
	public static void main(String[] args) {
		String line = "Heollo. World";
		
		System.out.println(line.length());
		
		String sub = line.substring(0, 3);
		System.out.println(sub);
		
		String hello = line.substring(0, line.indexOf('.'));
		System.out.println(hello);
		
		String world = line.substring(line.indexOf('W'));
		System.out.println(world);
		
		System.out.println(line.substring(0));
		System.out.println(line.substring(0, 7));
	}
}
