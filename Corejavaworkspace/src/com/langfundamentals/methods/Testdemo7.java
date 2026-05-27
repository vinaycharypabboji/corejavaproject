package com.langfundamentals.methods;
import java.util.Scanner;

public class Testdemo7 {
	static double pi=3.14;
	static Scanner sc = new Scanner(System.in);
	double r = sc.nextDouble();
	
	double area_circle() {
		double area = pi * r * r;
		return area;
	}
	double vol_circle() {
		double vol = (4.0/3.0)*pi*r*r*r;
		return vol;
	}
	double perimeter_circle(){
		double peri = 2*pi*r;
		return peri;
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("Enter Radius of the circle:");
		Testdemo7 t = new Testdemo7();
		
		System.out.println("Area of circle is:" + t.area_circle());
		System.out.println("Volume of circle is:" + t.vol_circle());
		System.out.println("Perimeter of circle is:" + t.perimeter_circle());
		

	}

}
