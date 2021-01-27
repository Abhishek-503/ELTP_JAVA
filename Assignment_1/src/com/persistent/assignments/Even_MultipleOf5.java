/*2. Print all even and multiple of 5 numbers from an array
		if(no%2==0 && no%5==0)*/
package com.persistent.assignments;

public class Even_MultipleOf5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {10,11,12,3,5,21,20,2};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0 && a[i]%5==0) {
				System.out.print(a[i]+" ");
			}
		}
	}

}
