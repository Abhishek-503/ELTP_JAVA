/*4. Find the total vowels present in a String
*/
package com.persistent.assignments;

public class Count_Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Abhishek is a good boy";
		int count=0;
		for(int i=0;i<a.length();i++) {
			char ch = a.charAt(i);
			if("aeiouAEIOU".indexOf(ch)!=-1) {
				count += 1; 
			}
		}
		System.out.println("The count of all vowels is : "+count);
	}

}
