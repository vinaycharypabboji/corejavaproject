package com.arrays;

public class TwoDarray {

	public static void main(String[] args) {
		String[][] fruits = {{"apple","banana","mango"},{"pears","grapes","dates"}};
		
		for(int i=0;i<fruits.length;i++) {
			for(int j=0;j<fruits[i].length;j++) {
				System.out.print(fruits[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("***************************");
		for(String[] n:fruits) {
			for(String f:n) {
				System.out.print(f + " ");
			}
			System.out.println();
		}
	}

}
