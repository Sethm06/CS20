/*

Program: Digits.java          Last Date of this Revision: September 14, 2022

Purpose: An application that prompts the for the radius of a circle and calculates the circumference.

Author: Seth McKenzie 
School: CHHS
Course: Computer Science 20
 

*/

package SkillBuilding;

import java.util.Scanner;

public class CircleCircumference
{

    public static void main(String args[])
    {
    	double radius;
    	double circ;
    	
    	//Asks user for a radius
    	Scanner askRadius = new Scanner(System.in);
    	System.out.println("Please enter the radius of a circle: ");
    	radius = askRadius.nextDouble();
    	
    	//Calculate circumference of circle
    	circ = 2*Math.PI*radius;
    	
    	//Print ones and tens place digits
  	  	System.out.println("The circumference of this circle is: " + circ);
    	
    }
}


/* Screen Dump
 
Please enter the radius of a circle: 
4
The circumference of this circle is: 25.132741228718345
 
 */