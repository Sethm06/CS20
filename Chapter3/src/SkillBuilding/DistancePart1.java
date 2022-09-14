/*

Program: DistancePart1.java          Last Date of this Revision: September 13, 2022

Purpose: An application that calculates the total distance of a 3 part race.

Author: Seth McKenzie 
School: CHHS
Course: Computer Science 20
 

*/

package SkillBuilding;

public class DistancePart1
{

    public static void main(String args[])
    {
    	
    	//Set up variables
    	double firstSegment, secondSegment, thirdSegment;
    	double totalDistance;
    	
    	//Give variables values
    	firstSegment = 12.2;
    	secondSegment = 10.6;
    	thirdSegment = 5.8;

    	//Calculate total distance
    	totalDistance = firstSegment + secondSegment + thirdSegment;
    	
    	//Display total distance
    	System.out.println("Total distance = " + totalDistance + "km");

    }
}


/* Screen Dump
 
Total distance = 28.599999999999998km
 
 */