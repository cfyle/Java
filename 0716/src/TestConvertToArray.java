import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestConvertToArray {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("가", "나", "다"));
		
		list.add("라");
		
		System.out.println(list.toString());
		
		String[] arr = list.toArray(new String[0]);
		
		
//		String[] arr = new String[list.size()];
//
//		for (int i = 0; i < list.size(); i++) {
//			arr[i] = list.get(i);
//		}
		
		System.out.println(Arrays.toString(arr));
		
		int[] numbers = {10, 20, 30, 40};
		
		List<Integer> listNum = new ArrayList<>();
		
		for (int n : numbers) {
			listNum.add(n);
		}
		System.out.println(listNum.toString());
		
	}
}
