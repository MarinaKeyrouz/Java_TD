package td3ex2;

public class MyList {
	Cell head;
	Cell last;

	public void add(Object data) {
		Cell h = new Cell(data);
		if (this.head == null) {
			this.head = h;
			this.last=h;
		} else {
			Cell temp=this.head;
			this.head=h;
			head.next=temp;
		}
	}
	public void add(Object data, int i) {
		Cell h =new Cell(data);
		Cell l=this.head;
		int j=0;
		while(l.next!=null) {
			if(j==i) {
				Cell temp = l.next;
				l.next=h;
				h.next=temp;
				break;
			}
			l=l.next;
			j++;
		}
	}
	public String toString() {
		Cell currNode = head;
		String s = "";
		while (currNode != null) {
			s += currNode.data + ", ";
			currNode = currNode.next;
		}
		return s;
	}

	public int size() { 
		Cell currNode = head;
		int i = 0;
		while (currNode != null) {
			i++;
			currNode = currNode.next;
		}
		return i;
	}
	public void addLast(Object d) {
		Cell h = new Cell(d);
		if (this.head == null) {
			this.head = h;
			this.last=h;
		} else {
			Cell l = this.head;
			while (l.next != null) {
				l = l.next;
			}
			l.next = h;
			last=l.next;
		}
	}
	
	public Cell get(int i) {
		Cell l = this.head;
		int j=0;
		if(i==this.size()-1) {
			return this.last;
		}else if(i<this.size()-1) {
			while (l.next != null) {
				if(j==i) {
					return l;
				}
				j++;
				l = l.next;
			}
		}else {
			return new Cell("-1");
		}
		return null;
	}
	
	public String sumLetter() {
		Cell h=this.head;
		String s="";
		s=h.data.toString();
		while(h.next!=null) {
			h=h.next;
			s+=h;
		}
		return s;
	}
	
	public boolean contains(Object o) {
		Cell h =this.head;
		while(h.next!=null) {
			if(h.data.equals(o)) {
				return true;
			}
			h=h.next;
		}
		return false;
	}
	
}
