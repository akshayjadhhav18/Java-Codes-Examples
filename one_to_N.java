/*
Question:- Write a recursive code for 1 to n 
*/

package Recursion;

import java.util.Scanner;

public class one_to_N {
	
	static void printNumbers(int n) {
		
		if(n==1) {
			System.out.println(n);
			return;
		}
		
		printNumbers(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		printNumbers(n);
		
		sc.close();

	}

}
