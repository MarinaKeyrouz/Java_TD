package user;

import Controller.MouseController;
import Model.Model;
import View.MyDisplay;

public class Main {
	public static void main(String[] args) {
		MyDisplay md = new MyDisplay();
		Model m=new Model();
		MouseController c = new MouseController(m,md);
		
	}
}
