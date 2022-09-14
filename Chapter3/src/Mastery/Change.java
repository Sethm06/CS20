/*

Program: Change.java          Last Date of this Revision: September 14, 2022

Purpose: An application that calculates the minimum number of coins needed to form a user inputed amount of change..

Author: Seth McKenzie 
School: CHHS
Course: Computer Science 20
 

*/

package Mastery;

import java.util.Scanner;

public class Change
{

    public static void main(String args[])
    {
    	
    	//Set variable
    	double totalPrice = 0;
    	
    	//scan
  	  	Scanner askPrice = new Scanner(System.in);
  	  	System.out.println("Please enter the change in cents:");
  	  	totalPrice = askPrice.nextDouble();  
  	  	System.out.println("The minimum number of coins is: ");
  	  
  	  	//calculate quarters
  	  	int numberOfQuarters = (int)(totalPrice/25);
  	  	totalPrice = totalPrice - 25 * numberOfQuarters;
  	  	System.out.println("Quarters: " + numberOfQuarters);
  	  
  	  
  	  	//calculate dimes
  	  	int numberOfDimes = (int)(totalPrice/10);
  	  	totalPrice = totalPrice - 10 * numberOfDimes;
  	  	System.out.println("Dimes: " + numberOfDimes);
  	  
  	  
  	  	//calculate nickels
  	  	int numberOfNickels = (int)(totalPrice/5);
  	  	totalPrice = totalPrice - 5 * numberOfNickels;
  	  	System.out.println("Nickels: " + numberOfNickels);

  	  
  	  	//calculate pennies 
  	  	int numberOfPennies = (int)(totalPrice/1);
  	  	totalPrice = totalPrice - 1 * numberOfPennies;
  	  	System.out.println("Pennies: " + numberOfPennies);
  	  
    }
}


/* Screen Dump
 
Please enter the change in cents:
212
The minimum number of coins is: 
Quarters: 8
Dimes: 1
Nickels: 0
Pennies: 2
 
 */