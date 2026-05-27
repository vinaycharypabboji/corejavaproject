package com.javaintro;

public class Cricketers {
	static int country_ID=01;
	static String country_Name="INDIA";
	
	int jersyNo;
	String playerName;

	public static void main(String[] args) {
		System.out.println("*****Indian Cricket Team*****");
		System.out.println("-----------------------------------------");
		Cricketers msd = new Cricketers();
		msd.jersyNo = 7;
		msd.playerName = "Mahendra Singh Dhoni";
		System.out.println("Country ID:" + country_ID);
		System.out.println("Country Name" + country_Name);
		System.out.println("Player Name:" + msd.playerName);
		System.out.println("Jersy No:" + msd.jersyNo);
		System.out.println("-----------------------------------------");
		Cricketers Virat = new Cricketers();
		Virat.jersyNo = 18;
		Virat.playerName = "Virat Kohli";
		System.out.println("Country ID:" + country_ID);
		System.out.println("Country Name" + country_Name);
		System.out.println("Player Name:" + Virat.playerName);
		System.out.println("Jersy No:" + Virat.jersyNo);
		System.out.println("-----------------------------------------");
		Cricketers RS = new Cricketers();
		RS.jersyNo = 45;
		RS.playerName = "Rohith Sharma";
		System.out.println("Country ID:" + country_ID);
		System.out.println("Country Name" + country_Name);
		System.out.println("Player Name:" + RS.playerName);
		System.out.println("Jersy No:" + RS.jersyNo);
		System.out.println("-----------------------------------------");
		Cricketers  HP = new Cricketers();
		HP.jersyNo = 33;
		HP.playerName = "Hardik Pandya";
		System.out.println("Country ID:" + country_ID);
		System.out.println("Country Name" + country_Name);
		System.out.println("Player Name:" + HP.playerName);
		System.out.println("Jersy No:" + HP.jersyNo);
	}

}
