/*

Program: RectanglePerimeter.java          Last Date of this Revision: September 13, 2022

Purpose: An application that calculates the perimeter of a rectangle.

Author: Seth McKenzie 
School: CHHS
Course: Computer Science 20
 

*/

package SkillBuilding;

public class RectanglePerimeter
{

    public static void main(String args[])
    {
    	
    	//Set up variables
    	int width, length;
    	int perimeter;
    	
    	//Give variables values
    	width = 4;
    	length = 13;
    	
    	//Calculate perimeter
    	perimeter = width*2 + length*2;
    	
    	//Display perimeter
    	System.out.println ("Perimeter = " + perimeter);
       
    }
}


/* Screen Dump
 
Perimeter = 34
 
 */