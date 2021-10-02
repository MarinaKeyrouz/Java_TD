package fr.dauphine.javaavance.td1;

/*
 * Exercise 2:
 *  Exercise 5:
 */
public class Point {
	private double x;
	private double y;
	private int sum=0;
	
	public Point(double x,double y) {
		this.x=x;
		this.y=y;
		sum++;
	}
	public Point() {
		sum++;
	}
//	public static void main(String[] args) {
//		Point p=new Point();
//		System.out.println(p.x+" "+p.y);
//	}
	public Point(Point p2) {
		this.x=p2.x;
		this.y=p2.y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Point) {
			Point p=(Point) o;
			if(this.x==p.x && this.y==p.y)
				return true;
		}
		return false;
	}
	public boolean isSameAs(Point p) {
		if(this.x==p.x && this.y==p.y)
			return true;
		return false;
	}
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setX(double x) {
		this.x=x;
	}
	public void setY(double y) {
		this.y=y;
	}
	
	//Exercise 5
	public void translate(double dx,double dy) {
		this.x=this.x+dx;
		this.y=this.y+dy;
//		setX(x+dx);
//		setY(y+dy);
	}
}
