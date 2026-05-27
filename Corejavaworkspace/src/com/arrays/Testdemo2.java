package com.arrays;

public class Testdemo2 {

	public static void main(String[] args) {
		String fruits[] =  {"apple","banana","mango","watermelon","melon","peaches"};
		
		for(int i=0;i<fruits.length;i++) {
			System.out.println(fruits[i]);
		}
		System.out.println("***********************");
		
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		
		System.out.println("**********************");
		
		for(int i=0;i<fruits.length;i++) {
			if(fruits[i].contains("o")) {
				System.out.println(fruits[i]);
			}
		}
		
		System.out.println("**************************");
		for(String fruit:fruits) {
			if(fruit.contains("e")) {
				System.out.println(fruit);
			}
		}

	}

}
