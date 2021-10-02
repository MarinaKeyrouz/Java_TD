package fr.dauphine.javaavance.td1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//Exercise 4

public class PolyLine {
//	Point[] points;
	List <Point>points;
	int i;
	int c; // number of points currently in the array
	int n; // capacity of the array

	// Part 1 a 5
//	public PolyLine(int n) {
//		this.n = n;
//		points = new Point[n];
//	}

	public PolyLine() {
		points = new ArrayList<Point>();
	}

	// Part 1 a 5
//	public void add(Point p) {
//		Objects.requireNonNull(p, "Point must not be null");
//		points[c] = p;
//		c++;
//	}
	
	//Part 6
	public void add(Point p) {
		Objects.requireNonNull(p, "Point must not be null");
		points.add(p);
		c++;
	}

	// Part 1 a 5
//	public int PointCapacity() {
//		return this.n;
//	}
//
//	public int nbPoints() {
//		return c;
//	}

	//Part 6
	public int nbPoints() {
		return points.size();
	}

	//Part 1 to 5
	public boolean contains(Point p) {
		for (Point j : points) {
			if (j.getX() == p.getX() && p.getY() == j.getY()) {
				return true;
			}
		}
		return false;
	}
}
