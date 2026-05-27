package com.langfundamentals.constructors;

public class Bus {
	String b_name;
	double b_price;
	
	Bus(){
		System.out.println("constructor called");
	}
	Bus(String b_name,double b_price){
		this.b_name = b_name;
		this.b_price = b_price;
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		
		Bus b = new Bus();
		b.display();
		
		Bus b1 = new Bus("volvo",5000000.00);
		b1.display();
		
		Bus b2 = new Bus("BharatBenz",4800000.00);
		b2.display();

	}
	void display() {
		System.out.println("Bus brand is:" + b_name);
		System.out.println("Bus price is:" + b_price);
	}
}
