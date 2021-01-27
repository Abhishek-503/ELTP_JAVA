/*4.	Develop the program, which accepts the gross pay and produces the amount of tax owed. 
 * For a gross pay of $240 or less, the tax is 0%; for over $240 and less than 
$480, the tax rate is 15%; and for any pay over $480, the tax rate is 28%.
*/
package com.persistent.assignments;

import java.util.Scanner;

public class CalTax {
	static int gp;
	static double calTax(int gp) {
		double res;
		if(gp<=240) {
			res = 0*gp;
		}
		else if(gp>=240 && gp<480) {
			res = 0.15*gp;
		}
		else {
			res = 0.28*gp;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		gp = sc.nextInt();
		double res = calTax(gp);
		System.out.println("The amount of tax to be paid is : "+res);
		sc.close();
	}

}
