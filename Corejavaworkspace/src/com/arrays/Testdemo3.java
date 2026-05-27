package com.arrays;

public class Testdemo3 {

	public static void main(String[] args) {
		int sum = 0;
		double avg = 0;
		int marks[] = new int[5];

		marks[0] = 72;
		marks[1] = 91;
		marks[2] = 84;
		marks[3] = 59;
		marks[4] = 96;

		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		System.out.println("****************************");
		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
			
		}
		
		System.out.println(sum);
		System.out.println("****************************");
		avg = sum / marks.length;
		System.out.println(avg);
		System.out.println("****************************");
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] % 2 == 0) {
				System.out.println(marks[i]);
			}
		}
		System.out.println("****************************");
		for (int m : marks) {
			System.out.println(m);
		}
		System.out.println("****************************");
		for(int m:marks) {
			if(m%2==0) {
				System.out.println(m);
			}
		}
	}

}
