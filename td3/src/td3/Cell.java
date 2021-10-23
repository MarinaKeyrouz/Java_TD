package td3;

public class Cell {
	String data;
	Cell next;
	
	public Cell(String v) {
		this.data=v;
		next=null;
	}
	public String toString() {
		return data;
	}
}
