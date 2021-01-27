/*9.	Some credit card companies pay back a small portion of the charges a customer makes over a year. 
 * A particular credit card company's pay back policy is as follows:
1.0.25% for charges up to Rs.500.
2.0.50% for the next Rs.1000 (that is, the portion between Rs. 500 and Rs. 1500),
3.0.75% for the next Rs.1000 (that is, the portion between Rs. 1500 and Rs. 2500),
4.1.0% for charges above Rs2500.
Thus, a customer who charges Rs. 400 a year receives Rs.1.00,
which is 0.25 x 1/100 x 400, and 
one who charges Rs1,400 a year receives Rs. 5.75,
 which is 1.25 = 0.25 x 1/100 x 500 for the first Rs.500 and 
 0.50 x 1/100 x 900 = 4.50 for the next Rs. 900. 
 Determine by hand the pay backs amount for a customer who charged Rs. 2000 and 
 one who charged Rs. 2600.
Define the program, which accepts a charge amount and computes the corresponding pay back amount.
*/
package com.persistent.assignments;
import java.util.*;
public class CalLoan {
	
	  static float calLoan(int cusCharge) {
		  float res = 0.0f;
		  
		  if(cusCharge<=500) {
			  res = res + 0.25f*0.01f*cusCharge;
		  }
		  else if(cusCharge>500 && cusCharge<=1500){
			  cusCharge = cusCharge-500;
			  res = res + 0.25f*0.01f*500;
			  res = res + 0.50f*0.01f*cusCharge;
		  }
		  else if(cusCharge>1500 && cusCharge<=2500) {
			  cusCharge = cusCharge-500;
			  res = res + 0.25f*0.01f*500f;
			  cusCharge = cusCharge-1000;
			  res = res + 0.50f*0.01f*1000;
			  res = res + 0.75f*0.01f*cusCharge;
		  }
		  else {
			  cusCharge = cusCharge-500;
			  res = res + 0.25f*0.01f*500;
			  cusCharge = cusCharge-1000;
			  res = res + 0.50f*0.01f*1000;
			  cusCharge = cusCharge-1000;
			  res = res + 0.75f*0.01f*1000;
			  res = res + 1.00f*0.01f*cusCharge;
		  }
		  return res;
	  }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the charge amount of the customer : ");
		int cusCharge = sc.nextInt();
		float res = calLoan(cusCharge);
		System.out.println("The payback amount of the customer for the charge amount "+cusCharge+" is : "+res);
		sc.close();
	}

}
