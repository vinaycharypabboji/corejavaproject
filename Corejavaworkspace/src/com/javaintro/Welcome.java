package com.javaintro;

import java.util.*;
public class Welcome {

	public static void main(String[] args) {
		 int a = 10;
		System.out.println(a);
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age <18) {
			System.out.println("Minor");
		}
		else {
			System.out.println("Major");
			
		}

	}

}
