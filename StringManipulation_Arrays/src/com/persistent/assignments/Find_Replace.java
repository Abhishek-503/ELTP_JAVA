package com.persistent.assignments;

import java.util.Scanner;

public class Find_Replace {

	static String FindAndReplace(String str,String oldChar,String newChar) {
		String res = str.replace(oldChar, newChar);
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		System.out.println("Enter String to find and replace: ");
		String newChar = sc.next();
		System.out.println("Enter String to be replaced with: ");
		String oldChar = sc.next();
		String res = FindAndReplace(str,oldChar,newChar);
		System.out.println("The Result is : "+res);
		sc.close();
	}

}
