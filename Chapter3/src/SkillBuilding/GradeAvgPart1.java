/*

Program: GradeAvgPart1.java          Last Date of this Revision: September 14, 2022

Purpose: An application that calculates the average mark of 5 grades.

Author: Seth McKenzie 
School: CHHS
Course: Computer Science 20
 

*/

package SkillBuilding;

import java.util.Scanner;

public class GradeAvgPart1
{

    public static void main(String args[])
    {
    	
    	//Set up variables
    	int firstGrade;
    	int secondGrade;
    	int thirdGrade;
    	int fourthGrade;
    	int fithGrade;
    	int averageGrade;
    	
    	//Asks user for a grades
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Please enter your 1st grade: ");
    	firstGrade = input.nextInt();
    	System.out.println("Please enter your 2nd grade: ");
    	secondGrade = input.nextInt();
    	System.out.println("Please enter your 3rd grade: ");
    	thirdGrade = input.nextInt();
    	System.out.println("Please enter your 4th grade: ");
    	fourthGrade = input.nextInt();
    	System.out.println("Please enter your 5th grade: ");
    	fithGrade = input.nextInt();
    	
    	//Calculate average grade
    	averageGrade = firstGrade + secondGrade + thirdGrade + fourthGrade + fithGrade;
    	averageGrade = averageGrade / 5;
    	
    	//Print average grade
    	System.out.print("Your average grade is: " + averageGrade);
    	
    }
}


/* Screen Dump
 
Please enter your 1st grade: 
97
Please enter your 2nd grade: 
89
Please enter your 3rd grade: 
82
Please enter your 4th grade: 
93
Please enter your 5th grade: 
90
Your average grade is: 90
 
 */