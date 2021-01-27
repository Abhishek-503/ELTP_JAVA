/*1.	Find the number of occurrences of given word in a sentence.*/
package com.persistent.assignments;

import java.util.Scanner;

public class Check {
	static int check(String sentence,String word){
		String a[] = sentence.split(" ");
		int count = 0;
		for(int i = 0;i<a.length;i++) {
			if(word.equals(a[i])) {
				count = count + 1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence : ");
		String s = sc.nextLine();
		System.out.println("Enter the word to be counted : ");
		String w = sc.next();
		int res = check(s,w);
		System.out.println("The count of "+w+" present in the given sentence is : "+res);
		sc.close();
	}

}
