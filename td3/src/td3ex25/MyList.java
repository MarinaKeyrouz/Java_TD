package td3ex25;

public class MyList <E, T>{
	T head;
	T last;

	public void add(Object data) {
		Cell h = new Cell(data);
		if (this.head == null) {
			this.head = (T) h;
			this.last=(T) h;
		} else {
			Cell temp=(Cell) this.head;
			this.head=(T) h;
			Cell t = (Cell) this.head;
			t.next=temp;
			head=(T) t;
//			head.next= temp;
		}
	}
	public void add(Object data, int i) {
		Cell h =new Cell(data);
		Cell l=(Cell) this.head;
		int j=0;
		while(l.next!=null) {
			if(j==i) {
				Cell temp = (Cell) l.next;
				l.next=h;
				h.next=temp;
				break;
			}
			l=(Cell) l.next;
			j++;
		}
	}
	public String toString() {
		Cell currNode = (Cell) head;
		String s = "";
		while (currNode != null) {
			s += currNode.data + ", ";
			currNode = (Cell) currNode.next;
		}
		return s;
	}

	public int size() { 
		Cell currNode = (Cell) head;
		int i = 0;
		while (currNode != null) {
			i++;
			currNode = (Cell) currNode.next;
		}
		return i;
	}
	public void addLast(Object d) {
		Cell h = new Cell(d);
		if (this.head == null) {
			this.head = (T) h;
			this.last=(T) h;
		} else {
			Cell l = (Cell) this.head;
			while (l.next != null) {
				l = (Cell) l.next;
			}
			l.next = h;
			last=(T) l.next;
		}
	}
	
	public Cell get(int i) {
		Cell l = (Cell) this.head;
		int j=0;
		if(i==this.size()-1) {
			return (Cell) this.last;
		}else if(i<this.size()-1) {
			while (l.next != null) {
				if(j==i) {
					return l;
				}
				j++;
				l = (Cell) l.next;
			}
		}else {
			return new Cell("-1");
		}
		return null;
	}
	
	public String sumLetter() {
		Cell h=(Cell) this.head;
		String s="";
		s=h.data.toString();
		while(h.next!=null) {
			h=(Cell) h.next;
			s+=h;
		}
		return s;
	}
	
	public boolean contains(Object o) {
		Cell h =(Cell) this.head;
		while(h.next!=null) {
			if(h.data.equals(o)) {
				return true;
			}
			h=(Cell) h.next;
		}
		return false;
	}
	
}
