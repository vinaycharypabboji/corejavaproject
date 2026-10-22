package com.arrays;

public class Testdemo12 {

	public static void main(String[] args) {
		int arr[] = { 10, 12, 13, 15, 16, 17 };

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] + 1 != arr[i + 1]) {

				for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
					System.out.println(j);
				}
			}
		}
	}

}
