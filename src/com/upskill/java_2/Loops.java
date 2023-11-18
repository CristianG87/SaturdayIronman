package com.upskill.java_2;

public class Loops {

	/*
	 Type of Loops
	 1. For loop
	 2. While loop
	 3. Do While Loop
	 4. Infinite Loop
	 */
	
	public static void main(String[] args) {
		//practiceForLoop();
		//practiceWhileLoop();
		//practiceDoWhileLoop();
		//practiceInfiniteLoop();
		practiceNestedForLoop();
	}
	
	public static void practiceForLoop() {      // For Loop - Do again and again up to upper limit
		int i;										// Initialize the variable
		for(i=1; i<=10; i++) {						// Setting lower limit, Upper limit, Increment or Decrement
			System.out.println("For Loops number = " + i); // Statement
		}
	}

	public static void practiceWhileLoop() {   //While Loop - Do again and again up to condition match
		int i = 1;						// initialize the variable	
		while(i<=10) {				// set condition
			System.out.println("while Loops number = " + i); //statement
			i++;									// Increment or decrement
		}
	}
	
	public static void practiceDoWhileLoop() {  //Do while Loop- Do action then match condition
		int i = 1;								//Initialize the variable
		do {
			System.out.println("Do While loops number = " + i);//statement
			i++;									//Increment or Decrement
			} while (i<=10);					//checking condition
	}
	
	public static void practiceInfiniteLoop() { //Infinite loop - never ending Loop
		int i;									// initialize the variable
		for(i = 1; ; i++) {             // setting no upper limit
			System.out.println("Infinite Loop number = " + i);// statement
		}
	
	}
	public static void practiceNestedForLoop(){
		int i;
		int j;
		
		for (i=1; i<=10; i++){
			for (j=1; j<=10; j++) {
				int multiplicationTable = i * j;
				System.out.print(multiplicationTable + " |");
			}
			System.out.println(" ->");
		}
	}
	
}
