
public class TestPenClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		Pen p = new Pen(10000);
		Pen clone = (Pen) p.clone();
		
		System.out.println(clone.getPrice());
		
		System.out.println(p == clone);
	}
}
