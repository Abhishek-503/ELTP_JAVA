/*3.	Develop a program, that accepts a deposit amount and 
 * calculates amount of interest the deposit amount earns in a year. 
 * The bank pays a flat 4% interest for deposits of up to Rs.1000, 
 * a flat 4.5% per year for deposits of up to Rs.5000, 
 * and a flat 5% for deposits of more than Rs.5000.*/
package com.persistent.assignments;
import java.util.*;
public class CalInterest {
	static double calInterest(int amt) {
		int p=amt,t=1;
		float r;
		double res;
		if(p<=1000) {
			r = 4;
		}
		else if(p<=5000) {
			r = 4.5f;
		}
		else {
			r = 5;
		}
		res = (p*t*r)/100;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int deposit = sc.nextInt();
		double res = calInterest(deposit);
		System.out.println("The total Interest is : "+res);
		sc.close();
	}

}
