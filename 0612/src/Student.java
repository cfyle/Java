public class Student {
	int kor;
	int eng;
	int math;
	
	public int getSum() {
		return kor + eng + math;
	}
	
	public double getAvg() {
		int sum = getSum();
		return sum / 3.0;
	}

	public void printSum() {
		System.out.println(kor + eng + math);
	}
}
