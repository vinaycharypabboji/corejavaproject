package com.arrays;

import java.util.HashSet;
import java.util.Set;

public class Testdemo4 {

	public static void main(String[] args) {
		int[] roll = {18,19,20,30,45,21,22,23,24,25,18,19};
		
		Set <Integer> s = new HashSet<>();
		
		for(int i=0;i<roll.length;i++) {
			if(s.add(roll[i])) {
				System.out.println(roll[i]);
				
			}
		}
		
		
	}

}
