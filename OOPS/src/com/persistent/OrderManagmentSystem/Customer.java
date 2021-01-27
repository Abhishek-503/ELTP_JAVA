/*1.	We want to develop a Order Management system.  You have been assigned to work on part of the system and you will be developing the Customer class.  
•	The Customer class has the attributes - id, name, homePhone, cellPhone, workPhone, street, city, state, zip.
•	Create a constructor to create Customer class and it will get the parameters id and name.
•	It should have methods to printPhoneNumbers & printShippingAddress.
•	It should have setPrintingAddress method to change the address.  street, city, state and zip is provided as parameters
•	setPhoneNumbers to set the phone numbers.  All 3 phone numbers are provided as parameters
•	Provide a method to print all the values of fields in customer object
Develop another class called CustomerTest.  This class should create 3 Customers and call each of the Customer methods.
*/

package com.persistent.OrderManagmentSystem;

public class Customer {
	int id;
	String name;
	long homePhone;
	long cellPhone;
	long workPhone;
	String street;
	String city;
	String state;
	int zip;
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void printPhoneNumbers() {
		System.out.println(this.name+" registered contact numbers are :");
		System.out.println("Cell Phone no is :"+this.cellPhone);
		System.out.println("Home Phone no is :"+this.homePhone);
		System.out.println("Work phone no is :"+this.workPhone);
	}
	public void printShippingAddress() {
		System.out.println("Shipping Address of "+this.name+" is :");
		System.out.println("Street is :"+this.street);
		System.out.println("City is :"+this.city);
		System.out.println("State is :"+this.state);
		System.out.println("Zip is :"+this.zip);
	}
	public void setPrintingAddress(String street,String city,String state,int zip) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public void setPhoneNumbers(long cellPhone,long homePhone,long workPhone) {
		this.cellPhone = cellPhone;
		this.homePhone = homePhone;
		this.workPhone = workPhone;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", homePhone=" + homePhone + ", cellPhone=" + cellPhone
				+ ", workPhone=" + workPhone + ", street=" + street + ", city=" + city + ", state=" + state + ", zip="
				+ zip + "]";
	}
	
}
