
public class ShoesWithSize extends Shoes {
	private int size;

	public ShoesWithSize(String modelName, int price, int size) {
		super(modelName, price);
		this.size = size;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = super.equals(obj);
		
		if (result) {
			ShoesWithSize down = (ShoesWithSize) obj;
			return this.size == down.size;
		}
		return result;
	}



	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "ShoesWithSize [size=" + size + "]";
	}
	
	
}
