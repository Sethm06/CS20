/*

Program: Digits.java          Last Date of this Revision: September 14, 2022

Purpose: An application that prompts the user for a 3 digit number and displays the ones, tens, and hundreds place digits.

Author: Seth McKenzie 
School: CHHS
Course: Computer Science 20
 

*/

package Mastery;

import java.util.Scanner;

public class Digits
{

    public static void main(String args[])
    {
    	
    	//Asks user for a 3 digit integer
    	Scanner askNumber = new Scanner(System.in);
    	System.out.println("Please enter a 3 digit integer: ");
    	int number = askNumber.nextInt();
    	
    	//Calculate ones and tens place digits
    	int ones=(number/1)%10;
    	int tens= (number/10)%10;
    	int hundreds= (number/100)%10;
    	
    	//Print ones and tens place digits
  	  	System.out.println("The hundreds-place digit is: " + hundreds);
  	  	System.out.println("The tens-place digit is: " + tens);
  	  	System.out.println("The ones-place digit is: " + ones);
    	
    }
}


/* Screen Dump
 
Please enter a 3 digit integer: 
256
The hundreds-place digit is: 2
The tens-place digit is: 5
The ones-place digit is: 6

 */