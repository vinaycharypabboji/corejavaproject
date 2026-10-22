package com.arrays;

public class Testdemo9 {

	public static void main(String[] args) {
		int arr[] = { 2, 0, 5, 3, 9, 0, 1 };
		
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				for(int j = i;j<arr.length-1;j++) {
					arr[i] = arr[j+1];
				}
				arr[arr.length - 1] = 0;
			}

		}
		for(int a:arr) {
			System.out.println(a + " ");
		}
	}

}
