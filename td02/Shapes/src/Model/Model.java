package Model;

import java.util.ArrayList;
import java.util.List;

public class Model {
	public static List<Circle> shapes=new ArrayList<>();
	
	public Model() {
		shapes.add(new Circle(new Point(50,60),60));
	}
	public void add(Circle circle) {
		// TODO Auto-generated method stub
		shapes.add(circle);
	}
}
