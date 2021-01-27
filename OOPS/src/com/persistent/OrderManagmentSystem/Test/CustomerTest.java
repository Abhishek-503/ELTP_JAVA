package com.persistent.OrderManagmentSystem.Test;

import java.util.Scanner;

import com.persistent.OrderManagmentSystem.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c[] = new Customer[3];
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<c.length;i++) {
			System.out.println("Enter customer"+(i+1)+" id : ");
			int id = sc.nextInt();
			System.out.println("Enter customer"+(i+1)+" name : ");
			String s = sc.next();
			c[i] = new Customer(id, s);
		}
		for(int i = 0;i<c.length;i++) {
			System.out.println("Enter customer"+(i+1)+" cellPhone no : ");
			long cell = sc.nextLong();
			System.out.println("Enter customer"+(i+1)+" homePhone no : ");
			long home = sc.nextLong();
			System.out.println("Enter customer"+(i+1)+" workPhone no : ");
			long work = sc.nextLong();
			c[i].setPhoneNumbers(cell, home, work);
		}
		for(int i = 0;i<c.length;i++) {
			System.out.println("Enter customer"+(i+1)+"  Street: ");
			String st = sc.next();
			System.out.println("Enter customer"+(i+1)+" City : ");
			String ct = sc.next();
			System.out.println("Enter customer"+(i+1)+" State : ");
			String stt = sc.next();
			System.out.println("Enter customer"+(i+1)+" zip code : ");
			int z = sc.nextInt();
			c[i].setPrintingAddress(st, ct, stt, z);
		}
		System.out.println("Enter the no of customer you want to see : (ex:1 or 2 or 3");
		int ch = sc.nextInt();
		c[ch].printPhoneNumbers();
		c[ch].printShippingAddress();
		c[ch].toString();
		sc.close();
	}
}
