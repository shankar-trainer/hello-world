package com.capg.abstract1;

/*
class Day{
	public static  final int Monday=1; 
	public static  final int Tuesday=1; 
	public static  final int Wednesday=1; 
}
*/
interface Day {
	int Monday = 1;
	int Tuesday = 2;
	int Wednesday = 3;
	int Thursday = 3;
	int Friday = 3;
	int Saturday = 3;
	int Sunday = 3;
}

public class BirthDay {

	public static void main(String[] args) {
      int day=Day.Monday;
      //Day.Monday=99;
      System.out.println("My Birthday is on  "+day);
	}
}
