package fr.dauphine.javaavance.td1;

/*
 * Exercise 6:
 */
public class Ring {
	double r1, r2;
	Point p;

	public Ring(double r1, double r2, Point p) {
		if (r1 < r2) {
			this.r1 = r1;
			this.r2 = r2;
			this.p = p;
		} else {
			System.out.println("Invalid ring, try again");
		}
	}
	@Override
	public boolean equals(Object o) {
		Ring r=(Ring)o;
		if((this.p.equals(r.p))&&(this.r1==r.r1)&&(this.r2==r.r2)) {
			return true;
		}
		return false;
	}
	public String toString() {
		return "Centre: "+p+" Rayon 1: "+r1+" Rayon 2: "+r2;
	}
	public boolean contains(Point p1) {
		Circle c =new Circle(p,r2);
		if(c.contains(p1)) {
			return true;
		}
		return false;
	}

}
