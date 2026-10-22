package com.javaintro;

public class Cricketers {
	static int country_ID=1;
	static String country_Name="INDIA";
	
	int jersyNo;
	String playerName;

	public static void main(String[] args) {
		System.out.println("*****Indian Cricket Team*****");
		System.out.println("-----------------------------------------");
		Cricketers msd = new Cricketers();
		msd.jersyNo=7;
		msd.playerName="MahendraSingh Dhoni";
		System.out.println("CountryID: "+ country_ID);
		System.out.println("Country Name: "+ country_Name);
		System.out.println("Jersy No: "+ msd.jersyNo);
		System.out.println("Player Name: "+ msd.playerName);
		System.out.println("-------------------------------------------");
		Cricketers vk= new Cricketers();
		vk.jersyNo=18;
		vk.playerName="Virat kohli";
		System.out.println("CountryID: "+ country_ID);
		System.out.println("Country Name: "+ country_Name);
		System.out.println("Jersy No: "+ vk.jersyNo);
		System.out.println("Player Name: "+ vk.playerName);
		System.out.println("--------------------------------------------");
		
	}

}
