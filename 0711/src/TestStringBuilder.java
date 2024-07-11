public class TestStringBuilder {
	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder("원본");
		StringBuffer sb = new StringBuffer("원본");
		sb.append("추가 결합");
		sb.append(100);
		sb.append(44.33);
		
		
		sb.append(true).append('A').append("문자열");
		
		String sub = sb.substring(5, 10);
		System.out.println(sub);
		
		String result = sb.toString();
		
		System.out.println(result);
	}
}
