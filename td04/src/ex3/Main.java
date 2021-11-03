package ex3;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
//		Car c =new Car("BMW",6);
//		Garage g=new Garage();
//		g.add(c);
//		g.add(new Car("F",3));
//		g.add(new Car("F",4));
//		g.add(new Car("F",5));
//		g.add(new Car("E",34));
//		System.out.println(g);
//		System.out.println(g.firstCarByBrand("h"));
		
		//Exercice 2.1
		Car a = new Car("Audi",10000);
		Car b = new Car("BMW",9000);
		Car c = new Car("BMW",9000);
		Car d = a;
//		System.out.println(a==b);
//		System.out.println(b==c);
//		System.out.println(a==d);
//		System.out.println(a.equals(b));
//		System.out.println(b.equals(c));
//		System.out.println(a.equals(d));
		
		//Exercice2.2
//		ArrayList<Car> list = new ArrayList<>();
//		list.add(a);
//		list.add(b);
//		list.add(d);
//		System.out.println(list);
//		System.out.println(list.indexOf(a));
//		System.out.println(list.indexOf(b));
//		System.out.println(list.indexOf(c));
//		System.out.println(b.equals(c));
		
		//Exercice2.3
//		HashSet<Car> set = new HashSet<Car>();
//		set.add(b);
//		System.out.println(set.contains(c));
		
		//Exercice2.4
//		list.remove(a);
//		System.out.println(list);
//		Garage g =new Garage();
//		g.add(a);
//		g.add(b);
//		g.add(d);
//		Bike e=new Bike("bike");
//		g.add(e);
//		System.out.println(g);
		
//		Exercice3
		Garage g=new Garage();
		g.add(c);
		g.add(b);
		g.add(c);
		g.add(d);
		System.out.println(g);
		g.protectionism("BMW");
		System.out.println(g);

		
	}
	
}
