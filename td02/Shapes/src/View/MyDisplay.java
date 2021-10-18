package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import Model.Point;
import Model.Model;

//awt--> abstract window tool
import javax.swing.JFrame;
import javax.swing.JPanel;

import Model.Circle;

/*
 * Exercice 1 :
 * 5. When a window becomes visible (uncovered or deminimized) or is resized, the "system" automatically calls 
 * the paintComponent() method for all areas of the screen that have to be redrawn.
 * 6. Java Swing has more functionality as compared to AWT. MVC pattern is supported by Swing but not by AWT.
 */
public class MyDisplay extends JPanel{
	Model m;
	public MyDisplay() {
		 m= new Model();
		// TODO Auto-generated constructor stub
		JFrame frame = new JFrame("Java Avanc´e - Graphic Display"); //Create a frame with the title of Java Avanc´e - Graphic Display
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //used to specify one of several options for the close button 
		frame.setSize(new Dimension(500,500)); //set the dimensions 
		
		 frame.add(this); //add the panel

	    frame.setVisible(true); //// makes the frame appear on the screen
	}


	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int i=0;i<m.shapes.size();i++) {
			m.shapes.get(i).draw(g);
		}
	  }
	public void drawing() {
		repaint();
	}
}
