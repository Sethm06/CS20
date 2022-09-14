/*

Program: GradeAvgPart2.java          Last Date of this Revision: September 14, 2022

Purpose: An application that calculates the average mark of 5 grades using assignment operators.

Author: Seth McKenzie 
School: CHHS
Course: Computer Science 20
 

*/

package SkillBuilding;

import java.util.Scanner;

public class GradeAvgPart2
{

    public static void main(String args[])
    {
    	
    	//Set up variables
    	int firstGrade;
    	int secondGrade;
    	int thirdGrade;
    	int fourthGrade;
    	int fithGrade;
    	int averageGrade = 0;
    	
    	//Asks user for a grades
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Please enter your 1st grade: ");
    	firstGrade = input.nextInt();
    	averageGrade += firstGrade;
    	
    	System.out.println("Please enter your 2nd grade: ");
    	secondGrade = input.nextInt();
    	averageGrade += secondGrade;
    	
    	System.out.println("Please enter your 3rd grade: ");
    	thirdGrade = input.nextInt();
    	averageGrade += thirdGrade;

    	System.out.println("Please enter your 4th grade: ");
    	fourthGrade = input.nextInt();
    	averageGrade += fourthGrade;

    	System.out.println("Please enter your 5th grade: ");
    	fithGrade = input.nextInt();
    	averageGrade += fithGrade;

    	
    	//Calculate average grade
    	averageGrade /= 5;
    	
    	//Print average grade
    	System.out.print("Your average grade is: " + averageGrade);
    	
    }
}


/* Screen Dump
 
Please enter your 1st grade: 
87
Please enter your 2nd grade: 
82
Please enter your 3rd grade: 
84
Please enter your 4th grade: 
83
Please enter your 5th grade: 
88
Your average grade is: 84

 */