public class TestMyDynamic {
	public static void main(String[] args) {
		MyDynamicHolder<String> my = new MyDynamicHolder<>("문자열");
		String value = my.getValue();
		
//		MyDynamicHolder<String> your = new MyDynamicHolder<String>(100);
		
		MyDynamicHolder<Integer> your = new MyDynamicHolder<Integer>(100);
		Integer value2 = your.getValue();
		System.out.println(value2);
	}
}
