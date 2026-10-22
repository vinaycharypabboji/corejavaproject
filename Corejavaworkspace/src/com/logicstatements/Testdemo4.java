package com.logicstatements;

import java.util.Scanner;

public class Testdemo4 {
	static int price;
	static int total;

	public static void main(String[] args) {
		System.out.println("1.Non-veg /n 2.Veg");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter category :");
		int catg = sc.nextInt();

		switch (catg) {
		case 1 -> {
			System.out.println("what do you want to order? \n 1.Starter \n 2.Main Dish \n 3.Dessert");
			int dish = sc.nextInt();

			switch (dish) {
			case 1 -> {
				System.out.println("Enter the item \n: 1.Chicken-65 \n 2.Chilli-chicken ");
				int item = sc.nextInt();

				switch (item) {
				case 1 -> {
					int price = 120;
					total += price;
					System.out.println("120rs per single.");

				}
				case 2 -> {
					int price = 90;
					total += price;
					System.out.println("chilli-chicken" + (price) + "rs per single.");
				}

				}

			}
			case 2 -> {
				System.out.println("Enter the item: \n 1.ChickenBiryani \n 2.MuttonBiryani");
				int mdish = sc.nextInt();

				switch (mdish) {
				case 1 -> {
					int price = 380;
					total += price;
					System.out.println("chicken biryani is " + (price) + "rs for single");

				}
				case 2 -> {
					int price = 420;
					total += price;
					System.out.println("mutton biryani is " + (price) + "rs for single");
				}
				}

			}
			case 3 ->{
				System.out.println();
			}

			}
		}

		}

		System.out.println("total bill is:" + (total));

	}

}
