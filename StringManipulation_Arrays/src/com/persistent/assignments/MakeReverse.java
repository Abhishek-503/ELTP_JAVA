/*4.	Write a program that will reverse the sequence of letters in each word of a chosen paragraph . 
For instance, " To be or not to be " Would become " oT eb ro ton ot eb"*/
package com.persistent.assignments;

import java.util.Scanner;

public class MakeReverse {
	static String  makeReverse(String str) {
		String[] s = str.split(" ");
		String res = "";
		StringBuffer sb;
		for(int i=0;i<s.length-1;i++) {
			sb = new StringBuffer(s[i]);
			res = res + sb.reverse().toString() + " ";
		}
		res = res + new StringBuffer(s[s.length-1]).reverse().toString();
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		String res = makeReverse(str);
		System.out.println("The Result is : "+res);
		sc.close();
	}

}
