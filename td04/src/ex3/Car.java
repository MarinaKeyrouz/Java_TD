package ex3;

import java.util.Objects;
//TESTING

public class Car extends Vehicule{
	
	public Car(String brand, long value) {
		super(brand, value);
	}

	
	@Override
	public int hashCode() {
		return (int) (super.getValue()^(super.getValue()));
	}
	
	
//junit test
	/*
	 * assetEquals()
	 * assertthrow()
	 * assertNull()
	 */
	

}
