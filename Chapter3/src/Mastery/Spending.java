/*

Program: Spending.java          Last Date of this Revision: September 15, 2022

Purpose: An application that prompts the user for how much money they spent in different categories, and then calculates their budget.

Author: Seth McKenzie 
School: CHHS
Course: Computer Science 20
 

*/

package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Spending
{

    public static void main(String args[])
    {
    	
    	//Set up decimal format
    	DecimalFormat dc = new DecimalFormat("0.00");
    	
    	//Set up variables
    	double food;
    	double clothing;
    	double entertainment;
    	double rent;
    	double totalCost;
    	double foodPercent;
    	double clothingPercent;
    	double entertainmentPercent;
    	double rentPercent;
    	
    	//Set up scanner
    	Scanner input = new Scanner(System.in);
    	
    	//Prompt amount of money spent
    	System.out.println("Enter the amount spent last month on the following items: \n");
    	System.out.print("Food: $");
    	food = input.nextDouble();
    	System.out.print("Clothing: $");
    	clothing = input.nextDouble();
    	System.out.print("Entertainment: $");
    	entertainment = input.nextDouble();
    	System.out.print("Rent: $");
    	rent = input.nextDouble();
    	
    	//Calculate total money spent over past month
    	totalCost = food + clothing + entertainment + rent;
    	
    	//Calculate percent of total spent on items
    	foodPercent = (food / totalCost) * 100;
    	clothingPercent = (clothing / totalCost) * 100;
    	entertainmentPercent = (entertainment / totalCost) * 100;
    	rentPercent = (rent / totalCost) * 100;
    	
    	//Display budget
    	System.out.println("\nCategory          Budget");
    	System.out.println("Food              " + dc.format(foodPercent) + "%");
    	System.out.println("Clothing          " + dc.format(clothingPercent) + "%");
    	System.out.println("Entertainment     " + dc.format(entertainmentPercent) + "%");
    	System.out.println("Rent              " + dc.format(rentPercent) + "%");

    }
}


/* Screen Dump
 
Enter the amount spent last month on the following items: 

Food: $350
Clothing: $300
Entertainment: $250
Rent: $1250

Category          Budget
Food              16.28%
Clothing          13.95%
Entertainment     11.63%
Rent              58.14%


 */