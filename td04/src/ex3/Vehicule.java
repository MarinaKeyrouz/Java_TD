package ex3;

public class Vehicule {
	private String brand;
	private long value;
	Discount d;
	private boolean state;
	
	public Vehicule(String brand, long value) {
		if (value < 0) {
			throw new IllegalArgumentException("Only Positive Numbers & no Letters Please!"); 
		}else{
			d=new Discount(0);
			this.brand = brand;
			this.value = value;
		}
	}
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}
	public boolean isOnSold() {
		this.value=d.getValue();
		state=true;
		return state;
	}
	@Override
	public String toString() {
		return this.brand+" "+this.value;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Car) {
			Car c =(Car) obj;
			if((this.brand==c.getBrand())&(this.value==c.getValue())) {
				return true;
			}
		}
		return false;
	}
}
