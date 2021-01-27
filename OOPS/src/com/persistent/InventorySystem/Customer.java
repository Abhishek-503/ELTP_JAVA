/*1.	We want to develop a Order Management system.  You have been assigned to work on part of the system and you will be developing the Customer class.  
•	The Customer class has the attributes - id, name, homePhone, cellPhone, workPhone, street, city, state, zip.
•	Create a constructor to create Customer class and it will get the parameters id and name.
•	It should have methods to printPhoneNumbers & printShippingAddress.
•	It should have setPrintingAddress method to change the address.  street, city, state and zip is provided as parameters
•	setPhoneNumbers to set the phone numbers.  All 3 phone numbers are provided as parameters
•	Provide a method to print all the values of fields in customer object
Develop another class called CustomerTest.  This class should create 3 Customers and call each of the Customer methods.
*/

package com.persistent.InventorySystem;

public class Customer {
	int id;
	private String name;
	private long homePhone;
	private long cellPhone;
	private long workPhone;
	private String street;
	private String city;
	private String state;
	private int zip;
	private PurchaseOrder po[];
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(long homePhone) {
		this.homePhone = homePhone;
	}
	public long getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(long cellPhone) {
		this.cellPhone = cellPhone;
	}
	public long getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(long workPhone) {
		this.workPhone = workPhone;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public PurchaseOrder[] getPo() {
		return po;
	}
	public void setPo(PurchaseOrder[] po) {
		this.po = po;
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
	public String print() {
		return "Customer [id=" + id + ", name=" + name + ", homePhone=" + homePhone + ", cellPhone=" + cellPhone
				+ ", workPhone=" + workPhone + ", street=" + street + ", city=" + city + ", state=" + state + ", zip="
				+ zip + "]";
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int custId, String customerName, String city, PurchaseOrder[] po) {
		super();
		this.id = custId;
		this.name = customerName;
		this.city = city;
		this.po = po;
	}
	
	
}
