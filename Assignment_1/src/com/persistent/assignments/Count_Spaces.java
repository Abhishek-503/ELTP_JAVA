/*5. Find the total spaces present in a String
*/
package com.persistent.assignments;

public class Count_Spaces {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " Hello, My Name is Abhishek";
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(" ".indexOf(ch)!=-1) {
				count += 1; 
			}
		}
		System.out.println("The count of all spaces is : "+count);
	}

}
