package com.langfundamentals.constructors;

public class Car_details {
	String car_brand;
	long price;
	
	Car_details(){
		car_brand = "BMW";
		price = 2400000L;
	}
	
	void display() {
		System.out.println("Car Brand:" + (car_brand));
		System.out.println("Car Price:" + (price));
	}
	public static void main(String[] args) {
		Car_details c = new Car_details();
		
		c.display();
	}

}
