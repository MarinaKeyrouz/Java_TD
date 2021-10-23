package td3;

import java.util.Objects;

public class MyList {
	Cell head;
	Cell last;

	public void add(String data) {
		Objects.requireNonNull(data, "Data must not be null");
		Cell h = new Cell(data);
		if (this.head == null) {
			this.head = h;
			this.last = h;
		} else {
			Cell temp = this.head;
			this.head = h;
			head.next = temp;
		}
	}

	public void add(String data, int i) {
		Objects.requireNonNull(data, "Data must not be null");
		Objects.requireNonNull(i, "Data must not be null");
		Cell h = new Cell(data);
		Cell l = this.head;
		int j = 0;
		while (l.next != null) {
			if (j == i) {
				Cell temp = l.next;
				l.next = h;
				h.next = temp;
				break;
			}
			l = l.next;
			j++;
		}
	}

	public String toString() {
		Cell currNode = head;
		String s = "";
		while (currNode != null) {
			if (currNode.next == null) {
				s += currNode.data;
				break;
			}
			s += currNode.data + ", ";
			currNode = currNode.next;

		}
		return s;
	}

	public final int size() { // Modifier size() pour que cette methode s’effectue en temps constant?
		Cell currNode = head;
		int i = 0;
		while (currNode != null) {
			i++;
			currNode = currNode.next;
		}
		return i;
	}

	public void addLast(String d) {
		Objects.requireNonNull(d, "Data must not be null");
		Cell h = new Cell(d);
		if (this.head == null) {
			this.head = h;
			this.last = h;
		} else {
			Cell l = this.head;
			while (l.next != null) {
				l = l.next;
			}
			l.next = h;
			last = l.next;
		}
	}

	public Cell get(int i) {
		Cell l = this.head;
		int j = 0;
		if (i == this.size() - 1) {
			return this.last;
		} else if (i < this.size() - 1 && i >= 0) {
			while (l.next != null) {
				if (j == i) {
					return l;
				}
				j++;
				l = l.next;
			}
		} else {
			throw new IllegalArgumentException("Invalid number");
		}
		return null;
	}

	public int sumLetter() {
		Cell h = this.head;
		int s = 0;
		while (h.next != null) {
			s += h.data.length();
			h = h.next;
			if (h.next == null) {
				s += h.data.length();
			}
		}
		return s;
	}
}
