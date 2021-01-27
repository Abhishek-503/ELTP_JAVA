package com.persistent.assignments;

import java.util.Scanner;

public class X_O_Game {
	static char[][] ch = new char[3][3];
	public static void X_O() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) 
				System.out.print(" ---");
			System.out.println();
			System.out.print("| ");
			for(int j=0;j<3;j++) {
				System.out.print(ch[i][j]);
				System.out.print(" | ");
			}
			System.out.println();
		}
		for(int j=0;j<3;j++) 
			System.out.print(" ---");
		System.out.println();
	}
	public static void Replace_X(char c) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(ch[i][j]==c) {
					ch[i][j] = 'X';
					return;
				}
			}
		}
	}
	public static void Replace_O(char c) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(ch[i][j]==c) {
					ch[i][j] = 'O';
					return;
				}
			}
		}
	}
	public static boolean Check_Empty() {
		int account = 0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(ch[i][j]=='X'||ch[i][j]=='O') {
					account = account + 1;
				}
			}
		}
		if(account==9) {
			return false;
		}
		return true;
	}
	public static boolean check_Row(char c) {
		for(int i=0;i<3;i++) {
			if(ch[i][0]==c&&ch[i][1]==c&&ch[i][2]==c) {
				return true;
			}
		}
		return false;
	}
	public static boolean check_Column(char c) {
		for(int i=0;i<3;i++) {
			if(ch[0][i]==c&&ch[1][i]==c&&ch[2][i]==c) {
				return true;
			}
		}
		return false;
	}
	public static boolean check_Diagonal(char c) {
		boolean a=false,b=false;
		if(ch[0][0]==c&&ch[1][1]==c&&ch[2][2]==c) {
			a = true;
		}
		if(ch[0][2]==c&&ch[1][1]==c&&ch[2][0]==c) {
			b = true;
		}
		if(a||b) {
			return true;
		}
		return false;
	}
	public static boolean check(char c) {
		if(check_Row(c)||check_Column(c)||check_Diagonal(c)) {
			return true;
		}
		return false;
	}
	public static void clear_game() {
		char k = '1';
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				ch[i][j] = k;
				k = (char)(Integer.parseInt(String.valueOf(ch[i][j]))+1+'0');
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		char c;
		clear_game();
		do {
			for(int t=0;t<9;t++) {
				if(t%2==0) {
					System.out.println("Now Player 1 :");
					X_O();
					System.out.println("Enter the any number to replace with 'X'");
					char cho = sc.next().charAt(0);
					Replace_X(cho);
					X_O();
					if(check('X')) {
						System.out.println("Player 'X' wins");
						break;
					}
				}
				else {
					System.out.println("Now Player 2 :");
					X_O();
					System.out.println("Enter the any number to replace with 'O'");
					char cho = sc.next().charAt(0);
					Replace_O(cho);
					X_O();
					if(check('O')) {
						System.out.println("Player 'O' wins");
						break;
					}
				}
				if(!Check_Empty()) {
					System.out.println("It is a draw");
					break;
				}
			}
			System.out.println("Enter your choice(Y/y) : ");
			c = sc.next().charAt(0);
			clear_game();
		}while(c=='y'||c=='Y');
		sc.close();
	}

}
