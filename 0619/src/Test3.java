public class Test3 {
	public static void main(String[] args) {
		double[] d = new double[3];
		System.out.println(d[0]);
		
//		// 1.5의 배수, 1.5, 3.0, 4.5
//		for(int i = 0; i < d.length; i++) {
//			d[i] = 1.5 * (i + 1);
//		}
		
//		d = {1.5, 3.0, 4.5}  불가능 
		d = new double[] {1.5, 3.0, 4.5};
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
	}
}
