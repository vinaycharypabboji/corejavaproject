package com.langfundamentals.constructors;

public class Mobile {
	String m_brand;
	double m_price;
	{
		System.out.println("Mobile Brand:" + m_brand);
		System.out.println("Mobile price:" + m_price);
	}
	
	Mobile(){
		m_brand = "One Plus";
		m_price = 45000;
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Mobile m = new Mobile();
		m.display();
		System.out.println("Main method ended");
		

	}
	void display() {
		System.out.println("Mobile brand is :" + m_brand);
		System.out.println("Mobile Price is :" + m_price);
	}
}
