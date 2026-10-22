package com.arrays;

public class Testdemo16 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int target = 6;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i]-1;j++) {
				if(arr[j]==target) {
					System.out.println("target = " + target + "matches in the given array");
				}
				else {
					System.out.println("target is out of array");
					break;
				}
			}
			
		}

	}

}
