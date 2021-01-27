/*1.	Find the maximum of three numbers */
package com.persistent.assignments;
import java.util.*;

public class MaxOf3 {
	static int calMax(int a,int b,int c) {
		int t = (a>b)?a:b;
		int res = t>c?t:c;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int res = calMax(a,b,c);
		System.out.println("Max of "+a+","+b+","+"and "+c+" is: "+res);
		sc.close();
	}

}
