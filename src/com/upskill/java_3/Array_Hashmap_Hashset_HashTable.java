package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
	 
		int age = 30;						//Variable
		int[] ageIronMan = new int[]{25,32,37,21,27};		//Array
		
		//Array index              [0] [1] [2] [3] [4]
		
		System.out.println("Student Age : " + ageIronMan[2]);
		System.out.println("Total Student : " + ageIronMan.length);
		
		
		String[] nameIronMan = new String[] {"Madan", "Luis", "Yusuf","Sumaia", "Jannatul"};
		
		
		System.out.println("Student Name : " + nameIronMan[2]);
		System.out.println("Total student Name: " + nameIronMan.length);
				
		//Multi-Dimentional Array
		
		int [][] ageIronMan2D = {{25, 32, 37, 21, 27, 32},     //[0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
								{26, 30, 33, 28}};             //[1][0] [1][1[] [1][2][1][3]
		System.out.println("STUDEN Age 2D : " + ageIronMan2D[1][0]);
		
		// Hashmap store multipul data using key-value pair, Implementation of Map interface
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Yusuf", 28);
		Student.put("Abdullah", 22);
		Student.put("Madan", 32);
		Student.put("Jannatul", 24);
		Student.put("Fahim" , 22);
		
		System.out.println("HashMap Studetn Age : " + Student.get("Madan"));
		
		HashMap<String, String> capital = new HashMap<String, String>();
		capital.put("Mexico", "MX city");
		capital.put("USA", "WDC");
		System.out.println("Capital City : " + capital.get("USA"));
		
		//Hashset store unordered collection containing unique value, Implementation of set interface
		
		HashSet<String> car = new HashSet<String>();
		
		car.add("BMW");
		car.add("Toyota");
		car.add("Tesla");
		car.add("Audi");
		System.out.println("Car : " + car);
		
		//HashTable store multiple data using key-value pair, no duplicate, 
		//   also is synchronized (only one thread can be modified)
		
		
		HashMap<String, String> Region = new HashMap<String, String>();
		Region.put("Mexico", "MX city");
		Region.put("USA", "WDC");
		System.out.println("Region : " + Region.get("USA"));
		
		
		
		}
	}


