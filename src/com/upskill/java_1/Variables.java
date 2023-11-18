package com.upskill.java_1;

public class Variables {
 
	
	// variables in java
	// Instance Or global variable - variables declared 
	// Local variable - variable declared in methods
	//Static variable - variable belong to class and don't required creating object
	// Method parameter - variables used as method parameter
	
	public String country = "USA";    
	
	public static String region = "North America";
	
	public static void main(String[]args) {
		 
		String city = "New York";
		 
		 String  police = "NYPD";
		 
		 System.out.println(city);
		 
		 System.out.println(region);
		 nj("Essex");
		 pa("Bensalem");
		 Variables obj = new Variables();
		 System.out.println(obj.country);
		 
	
	}
	
	
	public static void nj(String county){  //method parameter
		
		String city = "Bloomfield";       //// Local variable - variable declared in methods
		
		String police = "BPD";
		 
		System.out.println(city);
		System.out.println(region);
		System.out.println(county);
		
	}
	
	public static void pa(String county){
		
		String city = "Phili";
		String police = "PPD";
		
		System.out.println(city);
		System.out.println(region);
		System.out.println(county);
		
		
	}
	

}
