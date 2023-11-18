package com.upskill.java_4;

public class Encapsulation {

	//Encapsulation used to hide the data using setter and getter method 
	
	private String name = "UpSkill";
	private int ssn = 45674;
	private String username = "Cristian";
	
	//setter Method - name              			//set the data, write
	public void setName(String value) {
		name = value;
	}
	
	//getter Method - name							//get the data, read
	public String getName() {
		return name;
	}
	
	//ssn - setter Method 							//set the data, write only
	
	public void setSSN (int value) {
		ssn = value;
	}
	
	//username - Getter Method 						// get the data, read only
	
	public String getUserName() {
		return username;
	}
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("Cristian");
		System.out.println(obj.getName());
		obj.setSSN(43576);
		System.out.println(obj.getUserName());

		
		
	}

}
