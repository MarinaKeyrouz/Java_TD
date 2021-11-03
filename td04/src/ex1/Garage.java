package ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//NUMERO 11???
//TESTING

public class Garage {
	private List<Car> cars;
	private static int id;
	
	public Garage() {
		this.cars=new ArrayList<Car>();
		id++;
	}
	
	public void add(Car c) {
		Objects.requireNonNull(c, "Car must not be null");
		cars.add(c);
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Cars: ");
		for (Car c: cars) {
			sb.append(c);
			sb.append(",");
		}
		sb.deleteCharAt(sb.length()-1);
		String s= sb.toString();
		return s;
	}
	public int valueOfG() {
		int s=0;
		for (Car c: cars) {
			s+=c.getValue();
		}
		return s;
	}
	public Car firstCarByBrand(String brand) {
		for(Car c:cars) {
			if(c.getBrand1().equals(brand)) {
				return c;
			}
		}
		return null;
	}
	
	public void remove(Car c) {
		for(Car i:cars) {
			if(i.equals(c)) {
				cars.remove(i);
				break;
			}
		}
	}
}
