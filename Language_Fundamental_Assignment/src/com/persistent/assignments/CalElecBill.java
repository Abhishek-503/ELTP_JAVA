/*8.	Electricity board wants to develop program to calculate Electricity Bill. 
 * They have two types of connections domestic and commercial, 
 * charges for domestic bill are as follows if consumed units are less or 
 * equals 100 then Rs.4/units or Rs. 250 whichever is greater
if consumed units are between 100 to 300 then Rs.4.50/units
if more than 300 and less than 500 Rs.4.75/units and above 500 Rs.5/units
For commercial connections charges are calculated as follows 
Consumed units are less or equals 100 then Rs.4.25/units or Rs. 350 whichever is greater.
if consumed units are between 100 to 300 then Rs.4.75/units.
if more than 300 and less than 500 Rs.5/units and above 500 Rs.5.25/units calculate electricity bill.
*/
package com.persistent.assignments;
import java.util.*;
public class CalElecBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch;
		do {
			System.out.println("Enter Which department :\n1.Domestic\n2.Commercial\n");
			System.out.println("Enter either 1 or 2");
			int key = sc.nextInt();
			if(key==1 || key==2) {
				System.out.println("Enter electricity units : ");
				int units = sc.nextInt();
				float res=0;
				switch (key) {
				case 1:
					if(units<=100) {
						res = 250>units*4?250:units*4;
					}
					else if(units>100 && units<500) {
						res = units*4.75f;
					}
					else {
						res = units*5;
					}
					System.out.println("The Electricity bill is : "+res);
					break;
				case 2:
					if(units<=100) {
						res = 350>units*4.25f?350:units*4.25f;
					}
					else if(units>100 && units<=300) {
						res = units*4.75f;
					}
					else if(units>300 && units<=500){
						res = units*5;
					}
					else {
						res = units*5.25f;
					}
					System.out.println("The Electricity bill is : "+res);
					break;
				default:
					break;
				}
		}
		else {
			System.out.println("Data entered is invalid");
		}
		System.out.println("Do you want to continue?(Y\\N)");
		ch = sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		sc.close();
	}

}
