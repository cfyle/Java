
public class Coffee {
	private int amountBean;
	private int amountMilk;
	private int amountSugar;

	public Coffee(int amountBean, int amountMilk, int amountSugar) {
		super();
		this.amountBean = amountBean;
		this.amountMilk = amountMilk;
		this.amountSugar = amountSugar;
	}

	public int getAmountBean() {
		return amountBean;
	}

	public void setAmountBean(int amountBean) {
		this.amountBean = amountBean;
	}

	public int getAmountMilk() {
		return amountMilk;
	}

	public void setAmountMilk(int amountMilk) {
		this.amountMilk = amountMilk;
	}

	public int getAmountSugar() {
		return amountSugar;
	}

	public void setAmountSugar(int amountSugar) {
		this.amountSugar = amountSugar;
	}

	@Override
	public String toString() {
		return "Coffee [amountBean=" + amountBean + ", amountMilk=" + amountMilk + ", amountSugar=" + amountSugar + "]";
	}
	
	static class Barista {
		private int amountBean;
		private int amountMilk;
		private int amountSugar;
		
		public Barista bean(int bean) {
			amountBean = bean;
			return this;
		}
		
		public Barista milk(int milk) {
			amountMilk = milk;
			return this;
		}
		
		public Barista sugar(int sugar) {
			amountSugar = sugar;
			return this;
		}
		
		public Coffee build() {
			return new Coffee(amountBean, amountMilk, amountSugar);
		}
	}
	
	public static void main(String[] args) {
		Coffee americano = new Coffee.Barista().bean(3).milk(0).sugar(1).build();
	}

}
