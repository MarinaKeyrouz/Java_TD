package td3ex3;
/*
 * Td3 Exercice 3
 */

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
			 Map<Point, Circle> m = new HashMap<>();
			 Point p1 = new Point(100,150);
			 Circle c1 = new Circle(p1,100);
			 m.put(p1, c1);
			 System.out.println(m.containsKey(p1));
			 System.out.println(m.containsKey(new Point(100,150)));
	}
}
//results: true, false. It should have returned true, true
//How can I fix this?