public class TestRefArray4 {
	public static void main(String[] args) {
		
		// 한 문장으로 선언
		Student[] arr 
			= new Student[] {
					new Student("길동", 22, 100)
					, new Student("둘리", 33, 90)
					, new Student("도우너", 44, 80)
			};
		
		System.out.println(arr.length);
		
		arr[0] = null;
		arr[1] = null;
		arr[2] = null;
	}
}
