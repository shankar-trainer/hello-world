package com.capg.beans;

public class Seasons {  //not recommended to declare static and constants 

	public static  final int  Autumn=1;
	public static  final int  Winter=2;
	public static  final int  Summer=3;
	public static  final int  Rainy=4;

	public static void main(String[] args) {
		System.out.println(Seasons.Autumn);
		System.out.println(Seasons.Winter);
		System.out.println(Seasons.Summer);
		System.out.println(Seasons.Rainy);
		
		System.out.println("Days");
		System.out.println(Days.Monday);
		System.out.println(Days.Tuesday);
	}
}

interface Days{// recommended to declare static and constants 
	int Monday=1;
	int Tuesday=2;
	int Wednesday=3;
	int Thursday=4;
	int Friday=5;
	int Saturday=6;
	int Sunday=7;
}
