package com.arrays;

import java.util.Scanner;

public class Testdemo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter rows:");
		 int r = sc.nextInt();
		 
		 System.out.println("Enter columns:");
		 int c = sc.nextInt();
		 
		 int[][] roll = new int[r][c];
		 
		 for(int i=0;i<roll.length;i++) {
			 for(int j=0;j<roll[i].length;j++) {
				 roll[i][j] = sc.nextInt();
			 }
			 
		 }
		 for(int i=0;i<roll.length;i++) {
			 for(int j=0;j<roll[i].length;j++) {
				 System.out.print(roll[i][j] + " ");
			 }
			 System.out.println();
		 }
		 for(int i=0;i<roll.length;i++) {
			 for(int j=0;j<roll[i].length;j++) {
				 if(roll[i]==roll[j]) {
				 System.out.print(roll[i][j] + " ");
				 }
			 }
			 System.out.println();
		 }
	}

}
