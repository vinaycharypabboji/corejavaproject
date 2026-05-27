package com.langfundamentals.methods;

import java.util.Scanner;

public class Testdemo11 {
	static void total_marks(int sub1, int sub2, int sub3, int sub4, int sub5) {
		int total = sub1 + sub2 + sub3 + sub4 + sub5;
		System.out.println("Total marks = " + (total));

	}

	static double percentage(int sub1, int sub2, int sub3, int sub4, int sub5) {
		int sum = sub1 + sub2 + sub3 + sub4 + sub5;
		double percentile = (sum / 500.0) * 100;
		return percentile;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Maths marks :");
		int mat = sc.nextInt();

		System.out.println("Enter Science marks :");
		int sci = sc.nextInt();

		System.out.println("Enter Social marks :");
		int soc = sc.nextInt();

		System.out.println("Enter English marks :");
		int eng = sc.nextInt();

		System.out.println("Enter Hindi marks :");
		int hin = sc.nextInt();

		total_marks(mat, sci, soc, eng, hin);
		System.out.println(" Percentage Aquired : " + percentage(mat, sci, soc, eng, hin));

	}

}
