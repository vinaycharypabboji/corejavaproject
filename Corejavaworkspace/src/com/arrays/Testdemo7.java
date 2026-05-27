package com.arrays;

import java.util.Scanner;
public class Testdemo7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String arr[][] = {{"apple","mango","banana"},{"peach","pears","grapes"}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
				
			}
			System.out.println();
		}
		
		
		System.out.println("enter rows:");
		int r = sc.nextInt();
		
		System.out.println("enter columns:");
		int c = sc.nextInt();
		
		String names[][] = new String[r][c];
		sc.nextLine();
		for(int i=0;i<names.length;i++) {
			for(int j=0;j<names[i].length;j++) {
				names[i][j] =  sc.nextLine();
			}
		}
		
		for(int i=0;i<names.length;i++) {
			for(int j=0;j<names[i].length;j++) {
				System.out.println(names[i][j] + " ");
			}
			System.out.println();
		}
	}

}
