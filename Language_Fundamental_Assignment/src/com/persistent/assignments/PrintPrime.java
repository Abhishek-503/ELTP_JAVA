/*6.	Method will accept range value and 
 * print all prime numbers from 2 to range on console.*/
package com.persistent.assignments;
import java.util.*;
public class PrintPrime {
	void printPrime(int maxVal) {
		if(maxVal<2) {
			System.out.print("Value must be greater than or equal to 2");
		}
		else {
			System.out.println("Prime numbers in the range are : ");
			for(int i=2;i<=maxVal;i++) {
				int k = 0;
				for(int j=2;j<=i;j++) {
					if(i%j==0) {
						k = k+1;
					}
				}
				if(k==1)
					System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int maxVal = sc.nextInt();
		PrintPrime obj = new PrintPrime();
		obj.printPrime(maxVal);
		sc.close();
	}

}
