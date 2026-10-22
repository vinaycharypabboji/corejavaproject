package com.arrays;

public class Testdemo14 {

	public static void main(String[] args) {
		int a[]= {1,3,5,6,7,8,12};
		
		int max = 0;
		for(int i=0;i<a.length-1;i++) {
		if(a[i]>max) {
			max = a[i];
		}
		}
		System.out.println(max);
		
		for(int i=1;i<=max;i++) {
			boolean status = false;
			for(int j=0;j<a.length-1;j++) {
				if(a[j]==i) {
					status = true;
				}
				if(!status){
					System.out.println(a[j]);
				}
			}
			
		}
		
}
}
