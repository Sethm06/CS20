/*

Program: Order.java          Last Date of this Revision: September 15, 2022

Purpose: An application that prompts the user for the amount of food ordered and calculates the price + tax, while also showing the change due.

Author: Seth McKenzie 
School: CHHS
Course: Computer Science 20
 

*/

package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Order
{

    public static void main(String args[])
    {
    	
    	//Set up decimal format
    	DecimalFormat dc = new DecimalFormat("0.00");
    	
    	//Set up variables
    	double burgers;
    	double fries;
    	double sodas;
    	double burgersPrice = 1.69;
    	double friesPrice = 1.09;
    	double sodasPrice = 0.99;
    	double totalPrice = 0;
    	double taxPercent = 0.065;
    	double amountTendered;
    	double changeDue;
    	
    	//Set up scanner
    	Scanner input = new Scanner(System.in);
    	
    	//Prompts user for amount of food
    	System.out.println("Enter the number of burgers: ");
    	burgers = input.nextDouble();
    	System.out.println("Enter the number of fries: ");
    	fries = input.nextDouble();
    	System.out.println("Enter the number of sodas: ");
    	sodas = input.nextDouble();
    	
    	//Calculates price pre-tax
    	totalPrice = (burgers * burgersPrice) + (fries * friesPrice) + (sodas * sodasPrice); 
    	
    	//Displays price pre-tax
    	System.out.println("Total before tax: $" + dc.format(totalPrice));
    	
    	//Calculate and display tax and final price with tax
    	System.out.println("Tax: $" + dc.format(totalPrice*taxPercent));
    	System.out.println("Final total: $" + dc.format(totalPrice+(totalPrice*taxPercent)));
    	
    	//Prompt user for amount tendered
    	System.out.println("\nEnter amount tendered: ");
    	amountTendered = input.nextDouble();
    	
    	//Calculate amount of change due from amount tendered
    	changeDue = amountTendered - (totalPrice+(totalPrice*taxPercent));
    	
    	//Display change due
    	System.out.println("Change: $" + dc.format(changeDue));

    }
}


/* Screen Dump
 
Enter the number of burgers: 
2
Enter the number of fries: 
5
Enter the number of sodas: 
5
Total before tax: $13.78
Tax: $0.90
Final total: $14.68

Enter amount tendered: 
20
Change: $5.32


 */