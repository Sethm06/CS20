/*

Program: Digits.java          Last Date of this Revision: September 14, 2022

Purpose: An application that prompts the user for a 2 digit number and displays the ones and tens place digits.

Author: Seth McKenzie 
School: CHHS
Course: Computer Science 20
 

*/

package SkillBuilding;

import java.util.Scanner;

public class Digits
{

    public static void main(String args[])
    {
    	
    	//Asks user for a 2 digit integer
    	Scanner askNumber = new Scanner(System.in);
    	System.out.println("Please enter a 2 digit integer: ");
    	int number = askNumber.nextInt();
    	
    	//Calculate ones and tens place digits
    	int ones=(number/1)%10;
    	int tens= (number/10)%10;
    	
    	//Print ones and tens place digits
  	  	System.out.println("The ones-place digit is: " + ones);
  	  	System.out.println("The tens-place digit is: " + tens);
    	
    }
}


/* Screen Dump
 
Please enter a 2 digit integer: 
48
The ones-place digit is: 8
The tens-place digit is: 4
 
 */