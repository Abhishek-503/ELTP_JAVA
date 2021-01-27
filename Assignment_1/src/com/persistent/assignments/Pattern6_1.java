/*6. Print the following patterns
6.1
	1
	1 2
	1 2 3
	1 2 3 4
	1 2 3
	1 2
	1*/
package com.persistent.assignments;

public class Pattern6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		for(int i=1;i<=2*n-1;i++) {
			if(i<=n) {
				for(int j=1;j<=i;j++) {
					System.out.print(j+" ");
				}
			}
			else {
				for (int j = 1; j <=2*n-i; j++) {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}

}
