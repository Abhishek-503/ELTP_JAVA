/*7.	Write a function to find various combinations of entered string
For Eg  str= “123”
Output :
123     
132
213
231
312
321*/

package com.persistent.assignments;

import java.util.Scanner;

public class Combinations {
	static String getString(char[] ch) {
		char t = ch[0];
		for(int j=0;j<ch.length-1;j++) {
			ch[j] = ch[j+1]; 
		}
		ch[ch.length-1] = t;
		return String.valueOf(ch);
	}
	static String[]  getCombinations(String str) {
		char[] ch = str.toCharArray();
		String[] s = new String[ch.length*2];
		s[0] = str;
		for(int i=1;i<ch.length;i++) {
			ch = s[i-1].toCharArray();
			s[i] = getString(ch);
		}
		int k = 0;
		for(int j = ch.length;j<ch.length*2;j++) {
			s[j] = new StringBuffer(s[k++]).reverse().toString();
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s= sc.next();
		String[] str = getCombinations(s);
		for(String string:str) {
			System.out.println(string);
		}
		sc.close();
	}

}
