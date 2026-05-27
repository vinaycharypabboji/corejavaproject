package com.langfundamentals.constructors;
import java.util.Scanner;

public class Car {
	
	String c_brand;
	double c_price;
	String Org_name;
	
	Car(){
		System.out.println("Constructor called");
	}
	Car(String c_brand,double c_price,String Org_name){
		this.c_brand = c_brand;
		this.c_price = c_price;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Car Brand:");
		String c_brand = sc.nextLine();
		
		System.out.println("enter Car Price :");
		double c_price = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("Enter Organisation name:");
		String Org_name = sc.nextLine();
		
		Car c = new Car(c_brand,c_price,Org_name);
		
		c.display();

	}
	
	void display() {
		System.out.println("Car Brand is:" + c_brand);
		System.out.println("Car Price is:" + c_price);
		System.out.println("Organization Name is :" + Org_name);
	}
	
}
