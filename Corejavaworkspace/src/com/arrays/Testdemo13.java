package com.arrays;

public class Testdemo13 {

	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7 };
		int[] b = { 2, 4, 6, 8 };

		int c[] = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];
		}

		for (int c1 : c) {
			System.out.print(c1);

		}
		int temp;
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length - 1 - i; j++) {
				if (c[j] > c[j + 1]) {
					temp = c[j + 1];
					c[j + 1] = c[j];
					c[j] = temp;
				}
			}
			
		}
		System.out.println("After sorting");
		for (int c2 : c) {

			System.out.println(c2);
		}


	}

}
