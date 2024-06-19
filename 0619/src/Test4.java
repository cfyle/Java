public class Test4 {
	public static void main(String[] args) {
		boolean[] b = new boolean[3];

		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);

		boolean[] datas = { true, false, false, true, false };

		// 위 datas 배열의 true의 개수 출력하기
		int count = 0;
		for (int i = 0; i < datas.length; i++) {
			count += datas[i] ? 1 : 0;
		}
		System.out.println("총 true 의 개수 : " + count);
	}

}
