/*7.	An old-style movie theater has a simple profit program. 
 * Each customer pays $5 per ticket. 
 * Every performance costs the theater $20, plus $.50 per attendee. 
 * Develop the program that accepts the number of attendees (of a show) 
 * and calculates how much income the show earns.*/
package com.persistent.assignments;
import java.util.*;
public class CalculateProfit {
	static float calculateProfit(int numAttendees) {
		int totMoney = numAttendees*5;
		float totalCost = totMoney-20-numAttendees*(0.50f);
		return totalCost;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numAttendees = sc.nextInt();
		System.out.println("The total profit earned by the theatre is : "+calculateProfit(numAttendees));
		sc.close();
	}

}
