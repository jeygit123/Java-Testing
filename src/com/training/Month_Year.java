package com.training;

import java.util.Scanner;

public class Month_Year {

	public static void main(String[] args) {
	int month,year,days = 0;
	String NameOfMonth = "";
    Scanner sc = new Scanner(System.in);
    
	System.out.print(" Please Enter Month Number from 1 to 12:  ");
	month = sc.nextInt();
	{
		System.out.println("Enter year: ");
		year = sc.nextInt();
	switch(month) {
	case 1:
		NameOfMonth = "January";
		days = 31;
		break;
	case 2:
		NameOfMonth = "Febuary";
		if(year%400==0 || year%100==0 || year%4==0 && year%100!=0){
		days = 29;
		}else {
			days=28;
		}
			break;	
	case 3:
		NameOfMonth = "March";
		days = 31;
		break;	
	case 4:
		NameOfMonth = "April";
		days = 30;
		break;
	case 5:
		NameOfMonth = "May";
		days = 31;
		break;	
	case 6:
		NameOfMonth = "June";
		days = 30;
		break;	
	case 7:
		NameOfMonth = "July";
		days = 31;
		break;	
	case 8:
		NameOfMonth = "August";
		days = 31;
		break;	
	case 9:
		NameOfMonth = "September";
		days = 30;
		break;	
	case 10:
		NameOfMonth = "October";
		days = 31;
		break;		
	case 11:
		NameOfMonth = "November";
		days = 30;
		break;	
	case 12:
		NameOfMonth = "December";
		days = 31;
		break;
  default:	
		System.out.println("\n Please enter Valid Number between 1 to 12");
		
}
    System.out.println(NameOfMonth+ " will have "+ days+" days in "+year);
	}
}
}


