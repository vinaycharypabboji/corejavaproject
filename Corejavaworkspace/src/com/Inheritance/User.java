package com.Inheritance;

public class User {

	public static void main(String[] args) {
		Guest g = new Guest();
		g.read();
		
		Developer d = new Developer();
		d.read();
		d.write();
		
		Admin a = new Admin();
		a.read();
		a.write();
		a.manage();

	}

}
