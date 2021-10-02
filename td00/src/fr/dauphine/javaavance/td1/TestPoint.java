package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

/*
 * Exercise 2 et 3  
 */

public class TestPoint {
	public static void main(String[] args) {
		// Exercise 2
//	Point p=new Point();
////	System.out.println(p.x+" "+p.y);
//	System.out.println(p);

		// Exercise 3
		// Part1
//	Point p1=new Point(1,2);
//	Point p2=p1;
//	Point p3=new Point(1,2);
//	System.out.println(p1==p2);
//	System.out.println(p1==p3);

		// Part 3
//	Point p1=new Point(1,2);
//	Point p2=p1;
//	Point p3=new Point(1,2);
//	
//	ArrayList<Point> list = new ArrayList<>();
//	list.add(p1);
//	System.out.println(list.indexOf(p2));
//	System.out.println(list.indexOf(p3));

		// Exercise 4
//	Point p1=new Point(1,2);
//	Point p2=new Point(3,9);
//	Point p3=new Point(4,5);
//	PolyLine poly = new PolyLine();

////PolyLine poly=new PolyLine(5);
//	poly.add(p1);
//	poly.add(p2);
//	poly.add(p3);
//	System.out.println(poly.contains(p3));
//	System.out.println(poly.points);

//	poly.add(null);
//	
//	for (int i=0;i<poly.n;i++) {
//		System.out.println(poly.points[i]);
//	}

		// Exercise 5
//	Point p=new Point(1,2);
//	Circle c=new Circle(p,1);
//	Circle c2=new Circle(p,2);
//	c2.translate(1,1);
//	System.out.println(c+" "+c2);

//		Point p = new Point(1, 2);
//		Circle c = new Circle(p, 1);
//	c.getCenter().translate(1,1);
//		System.out.println(c);
//		Circle c1 = new Circle(p, 3);
//		Circle c2 = new Circle(new Point(4, 6), 2);
//		Circle[] circles = { c, c1, c2 };
//		System.out.println(contains(p, circles));
//	System.out.println(c.contains(p));

//		Exercise 6:
//		Ring r1 = new Ring(2, 3, new Point(3, 4));
//		Ring r2 = new Ring(2, 3, new Point(3, 4));
//		System.out.println(r1);
//		System.out.println(r2);
//		System.out.println(r1.equals(r2));
//		System.out.println(r1.contains(new Point(1, 0)));
//		Ring [] rings = {r1,r2};
//		System.out.println(contains(new Point(1, 0),rings));
	}

	//Exercise 5
	public static boolean contains(Point p, Circle[] circles) {
		for (int i = 0; i < circles.length; i++) {
			if (circles[0].contains(p)) {
				return true;
			}
		}
		return false;
	}

	// Exercise 6
	public static boolean contains(Point p, Ring[] rings) {
		for (int i = 0; i < rings.length; i++) {
			if (rings[0].contains(p)) {
				return true;
			}
		}
		return false;
	}
}
