/*2.	Write a program to check whether the input alphabet is a vowel or not.*/
package com.persistent.assignments;
import java.util.*;
public class VowelOrNot {
	static boolean checkAlpha(char alph) {
		if("aeiouAEIOU".indexOf(alph)!=-1) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		char c = sc.next().charAt(0);
		if(checkAlpha(c)) {
			System.out.println(c+" is an Vowel");
		}
		else {
			System.out.println(c+" is not an Vowel");
		}
		sc.close();
	}

}
