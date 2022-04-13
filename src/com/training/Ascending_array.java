package com.training;
import java.util.Scanner;
public class Ascending_array {

	    public static void main(String[] args) 
	    {
	    	int count, display;
	    	
	    	Scanner scan = new Scanner(System.in);
	        System.out.print("Enter number of elements to be displayed in the array: ");
	        count = scan.nextInt();
	    
	        int num[] = new int[count];
	        System.out.println("Enter array elements:");
	        for (int i = 0; i < count; i++) 
	        {
	            num[i] = scan.nextInt();
	        }
	        scan.close();
	        for (int i = 0; i < count; i++) 
	        {
	            for (int j = i + 1; j < count; j++) { 
	                if (num[i] > num[j]) 
	                {
	                    display = num[i];
	                    num[i] = num[j];
	                    num[j] = display;
	                }
	            }
	        }
	        System.out.print("Array Elements in Ascending Order: ");
	        for (int i = 0; i < count - 1; i++) 
	        {
	            System.out.print(num[i] + ", ");
	        }
	        System.out.print(num[count - 1]);
	    }
	}
