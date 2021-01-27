/*5.	Find the number is prime or not.*/
package com.persistent.assignments;
import java.util.*;
public class PrimeNumber {
	static boolean isPrimeNumber( int num) {
		if(num==1 || num ==0) {
			return false;
		}
		else {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					return false;
				}
			}
			return true;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(isPrimeNumber(num)) {
			System.out.println(num+" is a prime number");
		}
		else {
			System.out.println(num+" is not a prime number");
		}
		sc.close();
	}

}
