package Model;

import java.awt.Graphics;
import java.lang.Math.*;

//Exercise 5

public class Circle {
	private double r; // rayon
	private Point p; // center location

	public Circle(Point p, double r) {
		this.r = r;
		this.p = p;
		//c= new Point(p.getX(),p.getY());
	}

	public String toString() {
		return "Le rayon est de: " + r + " cm, et le centre est " + p.toString() + ", area = " + area() + "\n";
	}

	public void translate(double a, double b) {
		// Exercise 5.1
		// 1er method
//		p.translate(a, b);   
		// 2eme method
		double x = p.getX();
		double y = p.getY();
		Point j = new Point(x + a, y + b);
		this.p = j;
	}

	public Point getCenter() {
		return p;
	}

	public double area() {
		return Math.PI * (r * r);
	}

	public boolean contains(Point p1) {
		if ((p1.getX() - p.getX()) * (p1.getX() - p.getX()) + (p1.getY() - p.getY()) * (p1.getY() - p.getY()) <= r
				* r) {
			return true;
		} else {
			return false;
		}
		
	}
	public double getr() {
		return r;
	}
	public Point getPoint() {
		return p;
	}
	public void draw(Graphics g) {
		g.drawOval((int)this.getPoint().getX(), (int)this.getPoint().getY(), (int)this.getr(), (int)this.getr());
	}
}
