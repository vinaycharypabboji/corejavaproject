package com.arrays;

public class Testdemo10 {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				System.out.print(arr[i] + " ");
			}
			if(i==(arr.length/2)) {
				System.out.print(arr[i] + " ");
			}
			if(i==(arr.length-1)) {
				System.out.print(arr[i] + " ");
			}
		}
			
	}

}

