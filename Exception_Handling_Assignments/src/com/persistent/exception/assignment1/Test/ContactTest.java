/*i.	A pop must fail on an uninitialized stack and empty stack
ii.	A push must fail on an uninitialized stack and stack which is already full
iii.	A push must fail on a stack if the Contact object’s validation fails.*/

package com.persistent.exception.assignment1.Test;

import java.sql.Date;

import com.persistent.DataStructures.Stack.Stack;
import com.persistent.exception.assignment1.Contact;

public class ContactTest  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Contact> s = new Stack<Contact>(5);

		Contact[] co = new Contact[6];
		//Throws Exception that stack is empty
		s.pop();
		for(int i=0;i<5;i++) {
			co[i] = new Contact();
			s.push(co[i]);
		}
		Contact c = new Contact();
		//Throws Exception that Stack is full
		s.push(c);
		System.out.println(s.isEmpty());
		
		c.setFirst_name("Adam"); 
		c.setMiddle_name("Arnold");
		c.setLast_name("AArian"); 
		c.setDate_of_birth(Date.valueOf("1988-06-27"));
		c.setGender('m'); 
		c.setAddress("d.no:16/345");
		c.setAnniversary(Date.valueOf("2015-05-29")); 
		c.setArea("gandhi road");
		c.setCity("pune"); 
		c.setPincode("123456"); 
		c.setState("Maharashtra");
		c.setCountry("India"); 
		c.setTelephone_number("9440123456");
		c.setMobile_number("323232133"); 
		c.setEmail("abhi@gmail.com");
		c.setWebsite("www.freshherbs.com"); 
		
		s.push(c);


	}

}
