import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Can {
	private String name;
	private int lotNumber;

	public Can(String name, int lotNumber) {
		super();
		this.name = name;
		this.lotNumber = lotNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLotNumber() {
		return lotNumber;
	}

	public void setLotNumber(int lotNumber) {
		this.lotNumber = lotNumber;
	}

	@Override
	public String toString() {
		return "캔 [이름 : " + name + ", 로트번호 : " + lotNumber + "]";
	}

}

public class Store {
	public static void main(String[] args) {
		Can c1 = new Can("콜라", 5);
		Can c2 = new Can("콜라", 2);
		Can c3 = new Can("사이다", 6);
		Can c4 = new Can("콜라", 1);
		Can c5 = new Can("환타", 4);
		
		List<Can> list = new LinkedList<>(Arrays.asList(c1, c2, c3, c4, c5));
		list.sort(new Comparator<Can>() {

			@Override
			public int compare(Can o1, Can o2) {
				return o1.getLotNumber() - o2.getLotNumber();
			}
		});
		
//		while (list.size() > 0) {
//		System.out.println(list.remove(0));
//		}
		Queue<Can> queue = (Queue<Can>) list;
		while (queue.size() > 0) {
			System.out.println(queue.poll());
		}
	}
}
