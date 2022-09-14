/*

Program: DistancePart2.java          Last Date of this Revision: September 14, 2022

Purpose: An application that calculates the total distance of a 3 part race based on user inputs.

Author: Seth McKenzie 
School: CHHS
Course: Computer Science 20
 

*/

package SkillBuilding;

import java.util.Scanner;

public class DistancePart2
{

    public static void main(String args[])
    {
    	
    	//Receives input for race segment lengths and sets the data to variables
    	Scanner askFirstSegment = new Scanner(System.in);
    	System.out.println("How many km was the first segment of the race? ");
    	Double firstSegment = askFirstSegment.nextDouble();
    	
    	Scanner askSecondSegment = new Scanner(System.in);
    	System.out.println("How many km was the second segment of the race? ");
    	Double secondSegment = askSecondSegment.nextDouble();
    	
    	Scanner askThirdSegment = new Scanner(System.in);
    	System.out.println("How many km was the third segment of the race? ");
    	Double thirdSegment = askThirdSegment.nextDouble();
    	
    	//Set total distance variable
    	double totalDistance;
    	
    	//Calculate total distance
    	totalDistance = firstSegment + secondSegment + thirdSegment;
    	
    	//Display total distance
    	System.out.println("Total distance = " + totalDistance + "km");

    }
}


/* Screen Dump
 
How many km was the first segment of the race? 
3.5
How many km was the second segment of the race? 
2.5
How many km was the third segment of the race? 
1.9
Total distance = 7.9km
 
 */