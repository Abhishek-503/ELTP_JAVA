/*6.2 for a given sting print following pattern 
	for eg if i/p str = Hello

	H
	H e
	H e l
	H e l l
	H e l l o*/
package com.persistent.assignments;

public class Pattern6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		for(int i=0;i<s.length();i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(s.charAt(j)+" ");
			}
			System.out.println();
		}
	}

}
