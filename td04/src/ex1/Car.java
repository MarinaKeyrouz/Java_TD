package ex1;

import java.util.Objects;
//TESTING

public class Car {
	private String brand1;
	private String brand2;
	private long value;

	public Car(String brand, String brand2, long value) {
		if (value < 0) {
			System.out.println("Try again");
		} else {
			this.brand1 = brand;
			this.brand2=brand2;
			this.value = value;
		}

	}
	public String getBrand1() {
		return brand1;
	}
	public String getBrand2() {
		return brand2;
	}

	public void setBrand1(String brand) {
		this.brand1 = brand;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return brand1+" "+brand2+" "+value;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Car) {
			Car c =(Car) obj;
			if((this.brand1==c.brand1)&(this.brand2==c.brand2)&(this.value==c.value)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return (int) (value^(value));
	}
	
	
	
	
	
//junit test
	/*
	 * assetEquals()
	 * assertthrow()
	 * assertNull()
	 */
	

}
