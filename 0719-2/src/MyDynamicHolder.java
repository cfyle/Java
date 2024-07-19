public class MyDynamicHolder<T> {
	private T value;
	
	public MyDynamicHolder(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
}
