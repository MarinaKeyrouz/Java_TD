package td3ex2;

public class Cell {
	Object data;
	Cell next;
	
	public Cell(Object v) {
		this.data=v;
		next=null;
	}
	public String toString() {
		return data.toString();
	}
}
