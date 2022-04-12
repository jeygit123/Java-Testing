package com.training;

import java.util.Scanner;

public class Month_Year {

	public static void main(String[] args) {
	int month,year,days = 0;	
    Scanner sc = new Scanner(System.in);
    
	System.out.print(" Please Enter Month Number from 1 to 12:  ");
	month = sc.nextInt();
	if(month<=12 && month>=1)
	{
		System.out.println("Enter year");
		year = sc.nextInt();
		
	if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
	{
		days = 31; 	
	}
	else if ( month == 4 || month == 6 || month == 9 || month == 11 )
	{
		days = 30;  	
	}  
	else {
		if ( month == 2 )
	
	{
		if(year%400==0 && year%100==0)
		{
			days = 29;
		}
	 
	else
	{
		if(year%4==0 && year%100!=0)
		{
			days = 29;
		}
		else
			days = 28;
	}
	}
	}
	System.out.println("Number of days in "+month+ " month "+ year+" year is: "+ days);
	}
	else {
		
		System.out.println("\n Please enter Valid Number between 1 to 12");
		month = sc.nextInt();
}
    
	}
}


