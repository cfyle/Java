class MyIntBox {
	int num;
}
public class RefTypeParameter {
	public void print(String word) {
		System.out.println(word);
	}
	
	public void printBoxNum(MyIntBox box) {
		System.out.println(box.num);
	}
	
	public void increaseBoxNum(MyIntBox box) {
		box.num++;
	}
	
	
	
	public static void main(String[] args) {
		RefTypeParameter r = new RefTypeParameter();
		MyIntBox box = new MyIntBox();
		box.num = 55;
		r.printBoxNum(box);
		r.increaseBoxNum(box);
		r.printBoxNum(box);
		
//		r.print("사과");
//		
//		String word = "바나나";
//		r.print(word);
	}
}
