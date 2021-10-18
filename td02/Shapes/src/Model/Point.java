package Model;

/*
 * Exercise 2:
 *  Exercise 5:
 *  
 *  Mutability, here not mutable --> need to add final for the  class
 */
public class Point {
	private double x;
	private double y;
	static int sum=0;
	
	public Point(double x,double y) {
		this.x=x;
		this.y=y;
		sum+=1;
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
	public int getSum() {
		return sum;
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
	
	//translate return a point 
	//point p=new point(x+dx,y+dy) because we are using final variables for point x and y
	
}
