/*2.	Ezee Shop has an online portal where customers can check about different products. 
Customers can search for products by giving a key word. 
Write a program that accepts a product name and a key word, 
and checks if the key word is present in the given product name.*/
package com.persistent.assignments;

import java.util.Scanner;

public class InitProductNames {
	static String[] initProductNames() {
		String[] str = {"Apple","PineApple","Mango"};
		return str;
	}
	static boolean isPresent(String[] productNames, String keyword) {
		for(int i=0;i<productNames.length;i++) {
			if(keyword.equalsIgnoreCase(productNames[i])) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] productNames = initProductNames();
		System.out.println("Enter keyword : ");
		String keyword = sc.next();
		if(isPresent(productNames, keyword)) 
			System.out.println(keyword+" is present in the list");
		else
			System.out.println(keyword+" is not present in the list");
		sc.close();
	}

}
