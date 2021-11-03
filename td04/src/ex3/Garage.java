package ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//NUMERO 11???

public class Garage {
	private List<Vehicule> vehicules;
	private static int id;
	
	public Garage() {
		this.vehicules=new ArrayList<Vehicule>();
		id++;
	}
	
	public void add(Vehicule c) {
		Objects.requireNonNull(c, "Vehicule must not be null");
		vehicules.add(c);
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Vehicules: ");
		for (Vehicule c: vehicules) {
			sb.append(c);
			sb.append(",");
		}
		sb.deleteCharAt(sb.length()-1);
		String s= sb.toString();
		return s;
	}
	public int valueOfG() {
		int s=0;
		for (Vehicule c: vehicules) {
			s+=c.getValue();
		}
		return s;
	}
	
	public boolean equals(Object o) {
		if(this.vehicules.equals(o)) {
			return true;
		}
		return false;
	}
	public Car firstCarByBrand(String brand) {
		for(Vehicule c:vehicules) {
			if((c instanceof Car) && (c.getBrand().equals(brand))) {
				return (Car)c;
			}
		}
		return null;
	}
	
	public void remove(Car c) {
		for(Vehicule i:vehicules) {
			if((c instanceof Car) && (i.equals(c))) {
				vehicules.remove(i);
				break;
			}
		}
	}
	public void protectionism(String brand) {
		for(int i=0;i<vehicules.size();i++) {
			if(vehicules.get(i).getBrand().equals(brand)) {
				vehicules.remove(i);
			}
		}
	}
}
