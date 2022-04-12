package com.training;

import java.util.Scanner;


public class Lucky_num {

	public static void main(String[] args) {
		int lucky = 5;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int guess = sc.nextInt();
		int count = 1;
		
		while(lucky != guess) {
		if(guess > lucky) {
			System.out.println("You guessed it high!!Number of guess:" +count + "\n Try a new Guess " );
			guess=sc.nextInt();
		}
		
		
		else if (guess<lucky)
		{
		System.out.println("You guessed it low!!Number of guess:" +count + " \n Try a new Guess");
		guess=sc.nextInt();
	}
			
	
 count ++;
}
		while(lucky == guess) {
			System.out.println("You guessed it right,in: "+count+ " attempts");
			guess=sc.nextInt();
		}
}}
