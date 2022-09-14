/*

Program: Order.java          Last Date of this Revision: September 14, 2022

Purpose: An application that prompts the user for the amount of food ordered and calculates the price + tax.

Author: Seth McKenzie 
School: CHHS
Course: Computer Science 20
 

*/

package Mastery;

import java.util.Scanner;

public class Order
{

    public static void main(String args[])
    {
    	
    	double burgers;
    	double fries;
    	double sodas;
    	double burgersPrice = 1.69;
    	double friesPrice = 1.09;
    	double sodasPrice = 0.99;
    	double totalPrice = 0;
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Enter the number of burgers: ");
    	burgers = input.nextDouble();
    	System.out.println("Enter the number of fries: ");
    	fries = input.nextDouble();
    	System.out.println("Enter the number of sodas: ");
    	sodas = input.nextDouble();
    	
    	totalPrice = (burgers * burgersPrice) 
    	
    }
}


/* Screen Dump
 
Please enter a 3 digit integer: 
256
The hundreds-place digit is: 2
The tens-place digit is: 5
The ones-place digit is: 6

 */