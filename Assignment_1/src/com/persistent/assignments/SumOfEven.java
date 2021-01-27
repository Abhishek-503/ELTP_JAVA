/*1. Find the total of even numbers present in an array
*/
package com.persistent.assignments;

public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {10,11,12,3,5,21,20,2};
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sum = sum + a[i];
			}
		}
		System.out.println("Sum of all even numbers is : "+sum);
	}

}
