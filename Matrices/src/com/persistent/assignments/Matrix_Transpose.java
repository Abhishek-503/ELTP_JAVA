package com.persistent.assignments;

import java.util.Scanner;

public class Matrix_Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[3][3];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("The transpose of the given matrix is");
		for(int i=0;i<3;i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[j][i]);
			}
			System.out.println();
		}
		sc.close();
	}

}
