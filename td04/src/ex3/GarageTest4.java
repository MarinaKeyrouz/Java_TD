package ex3;
/*
 * Le test est un echec parceque le constructor de car ne prend pas 4 arguement, 
 * ni le constructor de bike
 * 
 * Exercie 4: Je n'ai pas su le faire
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GarageTest4 {

	@Test
	public void garageEquality() {
		 Garage garage1 = new Garage();
		 Garage garage2 = new Garage();

		 Car car1 = new Car("BMW",  90000);
		 Car car2 = new Car("Lada",6500);
		 Car car3 = new Car("Lada", 5500);
		 Bike bike1 = new Bike("Scott");
		 Bike bike2 = new Bike("Merlin");
		 Bike bike3 = new Bike("Merlin");
		 
		 garage1.add(car1);
		 garage1.add(bike1);
		 garage1.add(car2);
		 garage1.add(bike2);
		 garage1.add(car3);        
		 garage1.add(bike3);
		 
		 garage2.add(bike1);
		 garage2.add(car1);    
		 garage2.add(car3); 
		 garage2.add(car2);
		 garage2.add(bike3);
		 garage2.add(bike2);       
		 
		 assertEquals(garage1, garage2);
	}
}

































//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.Test;
//
//public class GarageTest4 {
//
//	@Test
//	public void garageEquality() {
//		 Garage garage1 = new Garage();
//		 Garage garage2 = new Garage();
//
//		 Car car1 = new Car("BMW", "42abc75" , 90000);
//		 Car car2 = new Car("Lada", "42abc76", 6500, 2);
//		 Car car3 = new Car("Lada", "42abc76", 5500, 1);
//		 Bike bike1 = new Bike("Scott");
//		 Bike bike2 = new Bike("Merlin",new Discount(50));
//		 Bike bike3 = new Bike("Merlin");
//		 
//		 garage1.add(car1);
//		 garage1.add(bike1);
//		 garage1.add(car2);
//		 garage1.add(bike2);
//		 garage1.add(car3);        
//		 garage1.add(bike3);
//		 
//		 garage2.add(bike1);
//		 garage2.add(car1);    
//		 garage2.add(car3); 
//		 garage2.add(car2);
//		 garage2.add(bike3);
//		 garage2.add(bike2);       
//		 
//		 assertEquals(garage1, garage2);
//	}
//}
