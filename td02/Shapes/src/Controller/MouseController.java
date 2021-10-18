package Controller;

import java.util.List;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import com.sun.jdi.event.Event;

import Model.Model;
import View.MyDisplay;
import Model.Circle;
import Model.Point;

public class MouseController implements MouseMotionListener{
	Model m;
	MyDisplay md;
	
	public MouseController(Model m, MyDisplay md) {
		this.md=md;
		this.m=m;
		md.addMouseMotionListener(this);
	}

	public  void mouseMoved(MouseEvent e) {
		List<Circle> shapes= m.shapes;
		Circle c = shapes.get(shapes.size()-1);
		if(c.contains(new Point(e.getX(),e.getY()))) {
			m.add(new Circle(new Point(e.getPoint().getX(),e.getPoint().getY()),c.getr()));
			md.drawing();
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
