package com.langfundamentals.methods;

public class Testdemo1 {
	void addition() {
		System.out.println("Addition" + (10+20));
	}
	void subtraction() {
		System.out.println("subtraction" +(50-20) );
	}
	void multiply(){
		System.out.println("multiplication" +(7*3));
	}
	void division() {
		System.out.println("division" +(20/2));
	}
	public static void main(String[] args) {
		Testdemo1 t = new Testdemo1();
		t.addition();
		t.subtraction();
		t.multiply();
		t.division();

	}

}
