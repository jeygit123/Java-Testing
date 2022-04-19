package com.training;
import java.util.Scanner;
public class ElectricBill {
		   public double cal(int u) {
	        double amt = 0;        
	        if (u <= 200) {
	            amt = 50 * u;
	        }
	        else if (u < 200 || u>=500) {
	            amt = 50 * 200 + (u - 200) * 1.25;
	        }else if (u < 500 || u>=1000) {
	            amt = 50 * 200 + (u - 500) * 1.00;
	        }
	        
	        else {
	            amt = 50 * u + 1.25 * 300 + (u - 500) * 0.75;
	        }
	        return amt;
	    }
	    
	    public static void main(String args[]) {
	    	ElectricBill obj = new ElectricBill();
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter Name: ");
	        String name = in.nextLine();
	        System.out.print("Enter Consumer No.: ");
	        int cNo = in.nextInt();
	        System.out.print("Enter present reading: ");
	        int curr = in.nextInt();
	        System.out.print("Enter previous reading: ");
	        int prev = in.nextInt();
	        int used = curr - prev;
	        double amt = obj.cal(used);
	        System.out.println("Consumer No.\tName\tUnits Consumed\tAmount");
	        System.out.println(cNo + "\t\t" + name + "\t" + used + "\t" + amt);
	    }
	}
//	    public static void main(String[] args) 
//	    {
//	    	int count, display;
//	    	
//	    	Scanner scan = new Scanner(System.in);
//	        System.out.print("Enter number of consumers electric bill to be calculated in the array: ");
//	        count = scan.nextInt();
//	    
//	        int num[] = new int[count];
//	        System.out.println("Enter array elements:");
//	        for (int i = 0; i < count; i++) 
//	        {
//	            num[i] = scan.nextInt();
//	        }
//	        scan.close();
//	        for (int i = 0; i < count; i++) 
//	        {
//	            for (int j = i + 1; j < count; j++) { 
//	                if (num[i] > num[j]) 
//	                {
//	                    display = num[i];
//	                    num[i] = num[j];
//	                    num[j] = display;
//	                }
//	            }
//	        }
//	        System.out.print("Array Elements in Ascending Order: ");
//	        for (int i = 0; i < count - 1; i++) 
//	        {
//	            System.out.print(num[i] + ", ");
//	        }
//	        System.out.print(num[count - 1]);
//	    }
//	}
