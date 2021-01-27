/*6.3  For entered String Split String using spaces and print word on each line
	for eg   String str=" This is a Java World";

	expected Output
	
	This
	is
	a
	Java
	World*/
package com.persistent.assignments;

public class Pattern6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=" This is a Java World";
		String[] s= str.split(" ");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}

}
