
public class TestUtil {
	public static void main(String[] args) {
		MyCharArrayUtil util = new MyCharArrayUtil();
		char[] world = { 'w', 'o', 'r', 'l', 'd' };
		
		util.printElems(world);
		
		int index = util.find(world, 'r');
		System.out.println("r의 위치 : " + index);
		
		int result = util.find(world, 'x');
		if (result < 0) {
			System.out.println("x 는 존재하지 않음");
		}
		
		boolean exists = util.exist(world, 'k');
		System.out.println("k 의 존재 : " + exists);
		
//		String s;
//		s.indexOf(ch)
//		s.contains(s)
	}
}
