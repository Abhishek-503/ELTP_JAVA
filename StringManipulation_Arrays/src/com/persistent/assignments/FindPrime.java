package com.persistent.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class FindPrime {
	public static ArrayList<Integer> findPrime(ArrayList<Integer> list,int range) {
		for(int i=2;i<=range;i++) {
			int k = 0;
			for(int j=2;j<=i;j++) {
				if(i%j==0) {
					k = k+1;
				}
			}
			if(k==1)
				list.add(i);
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array range : ");
		int range = sc.nextInt();
		list = findPrime(list,range);
		/*
		 * for(int i=0;i<list.size();i++) { System.out.println(list.get(i)); }
		 */
		for(int i:list) {
			System.out.print(i+" ");
		}
		sc.close();
	}

}
