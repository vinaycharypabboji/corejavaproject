package com.arrays;

public class Testdemo8 {

	public static void main(String[] args) {
		
		int[][][] roll = {{{1,2,3},{4,5,6},{7,8,9}},{{4,5,6},{1,2,3},{7,8,9}},{{7,8,9},{4,5,6},{1,2,3}}};
		
		for(int i=0;i<roll.length;i++) {
			for(int j=0;j<roll.length;j++) {
				for(int k=0;k<roll[i][j].length;k++) {
					System.out.print(roll[i][j][k] + " ");
				}
				System.out.println();
				
			}
			System.out.println("**********");
		}
		
	}

}
