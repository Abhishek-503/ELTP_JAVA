/*3.	Write a program to find the availability of given number in the list. */
package com.persistent.assignments;
import java.util.*;
public class FindPosition {
	static int findPosition(int num,int[] nos) {
		for(int i=0;i<nos.length;i++) {
			if(num==nos[i]) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] nos = {10,20,30,40,50};
		int n = findPosition(num, nos);
		if(n!=-1)
			System.out.println("The element "+num+" is present at "+n);
		else
			System.out.println("Element not found");
		sc.close();
	}

}
