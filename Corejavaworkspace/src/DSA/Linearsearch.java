package DSA;

import java.util.Scanner;

public class Linearsearch {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter array size:");
		 int size = sc.nextInt();
		 int arr[] = new int[size];
		 
		 System.out.println("Enter your array:");
		 for(int i=0;i<size;i++) {
		 arr[i] = sc.nextInt();
		 }
		 System.out.println("Enter target value:");
		 int target = sc.nextInt();
		
		for(int i= 0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.println("Element found : " + arr[i]);
				break;
			}
			
		}

	}

}
