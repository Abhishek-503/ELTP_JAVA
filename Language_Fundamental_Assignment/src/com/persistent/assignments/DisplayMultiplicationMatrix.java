package com.persistent.assignments;

public class DisplayMultiplicationMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[20];
		int b[] = new int[20];
		int c[][] = new int[20][20];
		for(int i=1;i<=12;i++) 
			a[i] = i;
		for(int j=1;j<=12;j++) 
			b[j] = j;
		for(int i=0;i<=12;i++) {
			for(int j=0;j<=12;j++) {
				if(i==0 && j>0) {
					c[i][j] = j;
				}
				else if(j==0 && i>0) {
					c[i][j] = i;
				}
				else {
					c[i][j] = a[i]*b[j];
				}
			}
		}
		for(int i=0;i<=12;i++) {
			for(int j=0;j<=12;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
