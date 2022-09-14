/*

Program: TempConverter.java          Last Date of this Revision: September 14, 2022

Purpose: An application that converts a user entered temperature in Fahrenheit to Celsius.

Author: Seth McKenzie 
School: CHHS
Course: Computer Science 20
 

*/

package SkillBuilding;

import java.util.Scanner;

public class TempConverter
{

    public static void main(String args[])
    {
    	
    	//Set up variables
    	int fahrenheit;
    	int celsius;
    	
    	//Asks user for a grades
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Please enter the temperature in Fahrenheit: ");
    	fahrenheit = input.nextInt();
    	
    	//Calculate Fahrenheit to Celsius
    	celsius = (fahrenheit - 32) * 5/9;
    	
    	
    	//Print Celsius temperature
    	System.out.print("The temperature in Celcius is: " + celsius + " degrees");
    	
    }
}


/* Screen Dump
 
Please enter the temperature in Fahrenheit: 
32
The temperature in Celcius is: 0 degrees
 
 */