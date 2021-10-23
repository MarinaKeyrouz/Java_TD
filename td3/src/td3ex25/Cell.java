package td3ex25;

public class Cell<T> {
	T data;
	T next;
	
	public Cell(T v) {
		this.data=v;
		next=null;
	}
	public String toString() {
		return data.toString();
	}
}
