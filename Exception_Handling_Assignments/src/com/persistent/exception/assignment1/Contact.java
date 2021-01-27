package com.persistent.exception.assignment1;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.ValidationException;

public class Contact {
	String First_name,Middle_name, Last_name;
	Date Date_of_birth;
	char Gender; 
	Date Anniversary;
	String Address;
	String Area;
	String City;
	String Pincode;
	String State;
	String Country;
	String Telephone_number;
	String Mobile_number;
	String Email,Website;
	public String getFirst_name() {
		return First_name;
	}
	public void setFirst_name(String first_name) {
		First_name = first_name;
	}
	public String getMiddle_name() {
		return Middle_name;
	}
	public void setMiddle_name(String middle_name) {
		Middle_name = middle_name;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	public Date getDate_of_birth() {
		return Date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		Date_of_birth = date_of_birth;
	}
	public char getGender() {
		return Gender;
	}
	public void setGender(char gender) {
		Gender = gender;
	}
	public Date getAnniversary() {
		return Anniversary;
	}
	public void setAnniversary(Date anniversary) {
		Anniversary = anniversary;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getPincode() {
		return Pincode;
	}
	public void setPincode(String pincode) {
		Pincode = pincode;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getTelephone_number() {
		return Telephone_number;
	}
	public void setTelephone_number(String telephone_number) {
		Telephone_number = telephone_number;
	}
	public String getMobile_number() {
		return Mobile_number;
	}
	public void setMobile_number(String mobile_number) {
		Mobile_number = mobile_number;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getWebsite() {
		return Website;
	}
	public void setWebsite(String website) {
		Website = website;
	}
	public void validate() throws ValidationException{
		boolean a = true,b = true,c = true;
		if(First_name.isEmpty() && Last_name.isEmpty() && Date_of_birth==null && Email.isEmpty()) {
			a = false;
		}
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(Email);
		b = matcher.matches();
		if(getTelephone_number().length()<=0 || getMobile_number().length()<=0) {
			c = false;
		}
		if(!a && !b && !c) {
			throw new ValidationException("Core validation failed");
		}
		
	}
}
