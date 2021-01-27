/*1.	Create a class Medicine to represent a drug manufactured by a pharmaceutical company. 
 * Provide a function displayLabel() in this class to print Name and address of the company. 
Derive Tablet, Syrup and Ointment classes from the Medicine class. 
Override the displayLabel() function in each of these classes to print additional information suitable to the type of medicine. 
For example, in case of tablets, it could be “store in a cool dry place”, in case of ointments it could be “for external use only” etc.
Create a class TestMedicine. Write main function to do the following:
Declare an array of Medicine references of size 10
Create a medicine object of the type as decided by a randomly generated integer in the range 1 to 3. 
Refer Java API Documentation to find out random generation feature. 
Check the polymorphic behavior of the displayLabel() method.*/

package com.persistent.assignment;

import java.util.Random;
class Medicine{
	void displayLabel() {
		System.out.println("Mgd by: ABC Pharmaceutical\nLocated at: Bangalore");
		System.out.println("----------------------------------------");
	}
}
class Syrup extends Medicine{
	void displayLabel() {
		System.out.println("Mgd by: ABC Pharmaceutical\nLocated at: Bangalore");
		System.out.println("Use as prescibed by the doctor");
		System.out.println("----------------------------------------");
	}
}
class Tablet extends Medicine{
	void displayLabel() {
		System.out.println("Mgd by: ABC Pharmaceutical\nLocated at: Bangalore");
		System.out.println("store in a cool dry place");
		System.out.println("----------------------------------------");
	}
}
class Ointment extends Medicine{
	void displayLabel() {
		System.out.println("Mgd by: ABC Pharmaceutical\nLocated at: Bangalore");
		System.out.println("For external use only");
		System.out.println("----------------------------------------");
	}
}
public class TestMedicine {
	public Medicine getMedicineClass() {
		Random r = new Random();
		Medicine m = null;
		int low = 1;
		int high = 4;
		int result = r.nextInt(high-low) + low;
		switch (result) {
		case 1:
			m = new Syrup();
			break;
		case 2:
			m = new Tablet();
			break;
		case 3:
			m = new Ointment();
			break;
		default:
			break;
		}
		return m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMedicine Tm = new TestMedicine();
		Medicine m[] = new Medicine[10];
		for(int i=0;i<10;i++) {
			m[i] = Tm.getMedicineClass();
		}
		for(int i=0;i<10;i++) {
			m[i].displayLabel();
		}
	}

}
