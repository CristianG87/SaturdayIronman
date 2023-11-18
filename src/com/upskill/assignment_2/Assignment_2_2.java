package com.upskill.assignment_2;

public class Assignment_2_2 {

	//A school conducts a 100 mark exam for its student and grades them as follows:
	//Grade:
		//Grade A: Marks>=90
		//Grade B: Marks>=80-89
		//Grade C: Marks>=70-79
		//Grade D: Marks>=60-69 AND FAIL THEM WHO HAS <60
	  //Write a java program to calculate the grade for a student in a method passing 
      //parameter for grade to display every grade type, using if..else statement.*/
	
	public static void main(String[] args) {
	
		finalScore(80);
	}
		
	public static void finalScore(int grade) {
	
		
		if(grade>=90 && grade<=100) {
			System.out.println("Your grade is A");
		} else if(grade>=80 && grade<=89){
			System.out.println("Your grade is B");
		} else if (grade>=70 && grade<=79){
			System.out.println("Your grade is C");
		} else if (grade>=60 && grade<=79){
			System.out.println("Your grade is D");
		}else if (grade<60){
			System.out.println("grade is F");
		}else { 
			 System.out.println("invalid Grade enter");

	}

 }
}	
	
