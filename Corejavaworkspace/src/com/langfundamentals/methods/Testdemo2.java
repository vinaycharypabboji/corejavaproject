package com.langfundamentals.methods;

public class Testdemo2 {
	
	
	static void car_details(String car_name,String color,String brand,String model) {
		System.out.println("Car name: " +car_name);
		System.out.println("Color: " +color);
		System.out.println("Brand: " +brand);
		System.out.println("Model: " +model);
	}

	public static void main(String[] args) {
		car_details("BMW","Black","BMW","M4");

	}

}
